package br.com.pveronezi.ccpb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @RequestMapping("/mongodb")
    public String mongodb(@RequestParam(value="id", required=false, defaultValue="0") int id, Model model) {
        model.addAttribute("name", id);
        return "home";
    }

    @RequestMapping("/")
    public String home(@RequestParam(value="name", required=false, defaultValue="Home Page") String name, Model model) {
        model.addAttribute("name", name);
        return "home";
    }

}