package com.spring51.jstl;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
public class ElController {
    
    private static final Logger logger = LoggerFactory
            .getLogger(HomeController.class);
    
    @RequestMapping(value = "/El/El01", method = RequestMethod.GET)
    public String El01(Model model) {
    logger.info("El01");

    return "El/El01";
    }

    @RequestMapping(value = "/El/El02", method = RequestMethod.GET)
    public String El02(Model model) {
    logger.info("El02");

    return "El/El02";
    }
    @RequestMapping(value = "/El/El02sub", method = RequestMethod.GET)
    public String El02sub(Model model) {
    logger.info("El02sub");

    return "El/El02sub";
    }

    
}
