package com.spring65.phone.Controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

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

import com.spring65.phone.inf.IServicePhone;
import com.spring65.phone.model.ModelPhone;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/")
public class PhoneController {
    
    private static final Logger logger = LoggerFactory
            .getLogger(PhoneController.class);
    
    // ServiceUser 인스턴스 만들기.
    @Autowired
    IServicePhone               psvr;
    
    @RequestMapping(value = "/writeoneform", method = RequestMethod.GET)
    public String writeoneform(Model model) {
        
        return "writeOneForm";
    }
    
    @RequestMapping(value = "/writeone1", method = RequestMethod.POST)
    public String writeOnePost1(Model model, HttpServletRequest request) {
        String name = request.getParameter("name");
        String manufacturer = request.getParameter("manufacturer");
        String price = request.getParameter("price");
        ModelPhone phone = new ModelPhone();
        phone.setName(name);
        phone.setManufacturer(manufacturer);
        phone.setPrice(Integer.valueOf(price));
        model.addAttribute("phone", phone);
        psvr.insertPhone(phone);
        return "writeOneResult";
    }
    
    @RequestMapping(value = "/writeone2", method = RequestMethod.POST)
    public String writeOnePost2(Model model,
            @RequestParam(value = "name", defaultValue = "") String name,
            @RequestParam(value = "manufacturer", defaultValue = "") String manufacturer,
            @RequestParam(value = "price", defaultValue = "") int price) {
        ModelPhone phone = new ModelPhone();
        phone.setName(name);
        phone.setManufacturer(manufacturer);
        phone.setPrice(price);
        model.addAttribute("phone", phone);
        psvr.insertPhone(phone);
        return "writeOneResult";
    }
    
    @RequestMapping(value = "/writeone3", method = RequestMethod.POST)
    public String writeOnePost3(@ModelAttribute ModelPhone phone, Model model) {
        
        model.addAttribute("phone", phone);
        psvr.insertPhone(phone);
        return "writeOneResult";
    }
    
    @RequestMapping(value = "/writelist", method = RequestMethod.GET)
    public String writeListGet(Model model) {
        return "writeListForm";
    }
    
    @RequestMapping(value = "/writelist", method = RequestMethod.POST)
    public String writeListPost(Model model,
                                                                                    @ModelAttribute RepositoryPhone phone) {
        List<ModelPhone> phonelist = phone.getPhoneItems();
        // DB insert. 어떻게?
        psvr.insertPhoneList(phonelist);
        model.addAttribute("list", phonelist);
        return "writeListResult";
    }


    @RequestMapping(value = "/writelistall", method = RequestMethod.GET)
    public String writelistall(Model model) {
        List<ModelPhone> phonelist = null ;
        phonelist = psvr.getPhoneList();
        model.addAttribute("list", phonelist);
        return "writeListResult";
    }
}
