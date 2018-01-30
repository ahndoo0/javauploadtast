package com.spring.pj;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	   @RequestMapping(value = "/pj_main10", method = RequestMethod.GET)
	    public String pj_main10( Model model) {
	        logger.info("pj_main10");
	        
	        
	        
	        return "pj_main10";
	    }
       @RequestMapping(value = "/pj_main30", method = RequestMethod.GET)
       public String pj_main30( Model model) {
           logger.info("pj_main30");
           
           
           
           return "pj_main30";
       }
       @RequestMapping(value = "/pj_main50", method = RequestMethod.GET)
       public String pj_main50( Model model) {
           logger.info("pj_main50");
           
           
           
           return "pj_main50";
       }
}
