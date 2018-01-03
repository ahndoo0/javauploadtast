package com.spring61.rest.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;import javax.jws.WebParam.Mode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring61.rest.board.inf.IServiceUser;
import com.spring61.rest.board.model.ModelUser;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value="/rest")
public class RestController {
	
	private static final Logger logger = LoggerFactory.getLogger(RestController.class);
	//ServiceUser 인스턴스 만들기
	@Autowired
	IServiceUser usersvr;
	/**
	 * Simply selects the home view to render by returning its name.
	 *  Exception 
	 */
	@RequestMapping(value = "/selectuserlist", method = {  RequestMethod.GET,RequestMethod.POST  } )
	@ResponseBody
	public List<ModelUser> home(Model model)  {
		List<ModelUser> list = null;
        try {
            list = usersvr.selectUserList(null);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		return list;
	}
	
}
