package com.spring65.phone.Controller;

import java.util.Date;
import java.util.List;

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

import com.spring65.phone.inf.IServicePhone;


/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/phone")
public class PhoneController {
	
	private static final Logger logger = LoggerFactory.getLogger(PhoneController.class);
    
	// ServiceUser 인스턴스 만들기.
	@Autowired 
	IServicePhone usersvr;
	
	
}
