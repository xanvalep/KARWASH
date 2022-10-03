package com.co.karwash;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.co.karwash.dao.PersonaDAO;


@Controller
public class ControllerInicio {

    @Autowired
    private PersonaDAO personaDao;

    
    @GetMapping ("/")
    public String inicio() { 
    return "index";
    }
    @GetMapping ("/login")
    public String iniciosesion() { 
    return "inner-page";
    }
    @GetMapping ("/loginadmin")
    public String loginadmin(Model model) {
    var personas= personaDao.findAll();
    model.addAttribute("personas", personas);  
    return "loginadmin";
    }
    @GetMapping ("/user")
    public String iniciouser() { 
    return "user";
    }
}
