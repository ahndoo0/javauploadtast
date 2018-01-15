package com.spring81.bbs.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.naming.spi.DirStateFactory.Result;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring81.bbs.inf.IServiceBoard;
import com.spring81.bbs.inf.IServiceUser;
import com.spring81.bbs.model.ModelArticle;
import com.spring81.bbs.model.ModelAttachFile;
import com.spring81.bbs.model.ModelBoard;
import com.spring81.bbs.model.ModelComments;
import com.spring81.bbs.model.ModelPerson;
import com.spring81.bbs.model.ModelUser;

/**
 * Handles requests for the application home page.
 */
@Controller

public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    
	@Autowired
	IServiceUser svruser;
	
    @RequestMapping(value = "/user/", method = RequestMethod.GET)
    public String home(Model model) {
        logger.info("/user/");
       
        return "redirect:/user/login";  // redirect = /user/ 만 해도 login으로 갈수 있는 컨트롤러 
    }
   
    
    @RequestMapping(value = "/user/login", method = RequestMethod.GET)
    public String login(Model model , HttpServletRequest request
                                                                      ,@RequestParam (value="url" , defaultValue="")String url) {
        logger.info("/user/login : get");
        
        // 로그인 이전 페이지를 변수로 넘긴다 .
        if (url.isEmpty()) {
            url = request.getHeader("Refer");
      
                model.addAttribute("url", url);
        }
        return "user/login";
    }
    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    public String login(Model model  
                                                                 ,@RequestParam String url
                                                                 ,@RequestParam String userid
                                                                 ,@RequestParam String passwd) {
        logger.info("/user/login : post");
        ModelUser result = svruser.login(userid, passwd);
        if (result != null) {
            //로그인 성공
            if (url.isEmpty()) {
                return "redirect:/";
            }
            return "redirect:" +url;
        }
        else{
            //로그인 실패
            model.addAttribute("msg", "로그인실패");
            model.addAttribute("url", url);
        }
        return "user/login";
    }
    
}
