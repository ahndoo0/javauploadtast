package com.spring.examdb.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.examdb.model.ModelPhone;



/**
 * Handles requests for the application home page.
 */
@Controller
public class PhoneController {
	
	private static final Logger logger = LoggerFactory.getLogger(PhoneController.class);
	// ServiceUser 인스턴스 만들기.
    @Autowired
    com.spring.examdb.inf.IServicePhone               psvr;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
    @RequestMapping(value = "/phone/writeone", method = RequestMethod.GET)
    public String writeoneform(Model model) {
        
        return "writeOneForm";
    }
    @RequestMapping(value = "/phone/writeone", method = RequestMethod.POST)
    public String writeOnePost1(Model model, HttpServletRequest request) {
        String name = request.getParameter("phname");
        String manufacturer = request.getParameter("phfactory");
        String price = request.getParameter("phprice");
        ModelPhone phone = new ModelPhone();
        phone.setPhname(name);
        phone.setPhfactory(manufacturer);
        phone.setPhprice(Integer.valueOf(price));
       psvr.insertPhone(phone);
        return "redirect:/phone/writeonelist";
    }
    @RequestMapping(value = "/phone/writeonelist", method = RequestMethod.GET)
    public String writeonelist(Model model) {
        List<ModelPhone> phonelist = null ;
        phonelist = psvr.getPhoneList();
        model.addAttribute("phone", phonelist);
        return "writeOneResult";
    }
}
