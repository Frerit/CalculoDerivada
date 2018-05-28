package com.cal.jdp.ltr.calculoderivada;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping(value = "")
    public String index() {
//        model.addAttribute("message","Verdadero");
        return "home/index";
    }
}
