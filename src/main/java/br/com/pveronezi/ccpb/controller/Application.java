package br.com.pveronezi.ccpb.controller;

import br.com.pveronezi.ccpb.bean.Person;
import br.com.pveronezi.ccpb.dao.mongodb.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class Application  extends SpringBootServletInitializer implements CommandLineRunner{
    @Autowired
    private PersonDao personDao;

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }
    public static void main(String[] args) {
        System.out.println("-------------main-------------");
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("-------------TESTE-------------");
        personDao.deleteAll();

        // save a couple of customers
        personDao.save(new Person("Alice"));
        personDao.save(new Person("Bob"));

        // fetch all customers
        System.out.println("Customers found with findAll():");
        System.out.println("-------------------------------");
        for (Person person : personDao.findAll()) {
            System.out.println(person);
        }
        System.out.println();

        // fetch an individual customer
        System.out.println("Customer found with findByFirstName('Alice'):");
        System.out.println("--------------------------------");
        System.out.println(personDao.findByName("Alice"));

    }
}