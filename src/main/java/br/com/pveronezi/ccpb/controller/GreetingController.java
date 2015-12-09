package br.com.pveronezi.ccpb.controller;

import br.com.pveronezi.ccpb.bean.Person;
import br.com.pveronezi.ccpb.dao.mongodb.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    @Autowired
    private PersonRepository repository;

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @RequestMapping("/mongodb")
    public String mongodb(@RequestParam(value="id", required=false, defaultValue="0") int id, Model model) {
        System.out.println("-------------TESTE-------------");
        repository.deleteAll();

        // save a couple of customers
        repository.save(new Person("Alice"));
        repository.save(new Person("Bob"));

        // fetch all customers
        System.out.println("Customers found with findAll():");
        System.out.println("-------------------------------");
        for (Person person : repository.findAll()) {
            System.out.println(person);
        }
        System.out.println();

        // fetch an individual customer
        System.out.println("Customer found with findByFirstName('Alice'):");
        System.out.println("--------------------------------");
        System.out.println(repository.findByName("Alice"));
        return "home";
    }

    @RequestMapping("/")
    public String home(@RequestParam(value="name", required=false, defaultValue="Home Page") String name, Model model) {
        model.addAttribute("name", name);
        return "home";
    }

}