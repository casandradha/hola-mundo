package uia.arsoft.holamundo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import uia.arsoft.holamundo.model.Contact;

import javax.validation.Valid;

@Controller
public class HelloWorldController {

    /*@GetMapping("/hello/{name}")
    public String helloMethod(@PathVariable("name") String name, Model model){
        model.addAttribute("name", name);
        return "hello";
    }*/

    @GetMapping("/hello")
    public String helloMethod(Model model){
        model.addAttribute("contact", new Contact());
        return "hello";
    }

    @PostMapping("/hello")
    public String helloPost(@Valid Contact contact, Errors errors, Model model){
        if(errors.hasErrors()){
            return "hello";
        }
        model.addAttribute("contact", new Contact());
        model.addAttribute("contactInfo", contact);
        return "hello";
    }

}
