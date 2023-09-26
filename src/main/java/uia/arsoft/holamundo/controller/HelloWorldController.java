package uia.arsoft.holamundo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HelloWorldController {

    @GetMapping("/hello/{name}")
    public String helloMethod(@PathVariable("name") String nombre, Model model){
        model.addAttribute("name", nombre);
        return "hello";
    }

}
