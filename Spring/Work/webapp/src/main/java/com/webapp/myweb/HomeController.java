package com.webapp.myweb;

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
	  @RequestMapping(value = "company1", method = RequestMethod.GET)
	    public String company1(Model model) {
	        logger.info("company1.jsp");
	        
	        return "company1";
	    }
	  @RequestMapping(value = "company2", method = RequestMethod.GET)
      public String company2(Model model) {
          logger.info("company2.jsp");
          
          return "company2";
      }
	  @RequestMapping(value = "company3", method = RequestMethod.GET)
      public String company3(Model model) {
          logger.info("company3.jsp");
          
          return "company3";
      }
	  @RequestMapping(value = "footer", method = RequestMethod.GET)
      public String footer(Model model) {
          logger.info("footer.jsp");
          
          return "footer";
      }
	  @RequestMapping(value = "header", method = RequestMethod.GET)
      public String header(Model model) {
          logger.info("header.jsp");
          
          return "header";
      }
	  @RequestMapping(value = "/", method = RequestMethod.GET)
      public String home(Model model) {
          logger.info("home.jsp");
          
          return "home";
      }
	  @RequestMapping(value = "notice1", method = RequestMethod.GET)
      public String notice1(Model model) {
          logger.info("notice1.jsp");
          
          return "notice1";
      }
	  @RequestMapping(value = "notice2", method = RequestMethod.GET)
      public String notice2(Model model) {
          logger.info("notice2.jsp");
          
          return "notice2";
      }
	  @RequestMapping(value = "project", method = RequestMethod.GET)
      public String project(Model model) {
          logger.info("project.jsp");
          
          return "project";
      }
	  
	  @RequestMapping(value = "recruit", method = RequestMethod.GET)
      public String recruit(Model model) {
          logger.info("recruit.jsp");
          
          return "recruit";
      }
	  @RequestMapping(value = "request", method = RequestMethod.GET)
      public String request(Model model) {
          logger.info("request.jsp");
          
          return "request";
      }
}
