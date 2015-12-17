package br.com.pveronezi.ccpb;

import br.com.pveronezi.ccpb.domain.Address;
import br.com.pveronezi.ccpb.domain.Member;
import br.com.pveronezi.ccpb.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class Application extends SpringBootServletInitializer implements CommandLineRunner {

    @Autowired
    private MemberService memberService;

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        System.out.println("-------------TESTE-------------");
        memberService.cleanDb();
        for (int i = 0; i < 10; i++) {
            Member m = new Member("Usuário " + i);
            m.setAddress(new Address("Rua " + i, i * 3));
            memberService.insert(m);
        }

    }
}