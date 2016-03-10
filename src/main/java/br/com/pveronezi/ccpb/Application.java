package br.com.pveronezi.ccpb;

import br.com.pveronezi.ccpb.domain.*;
import br.com.pveronezi.ccpb.domain.enumeration.*;
import br.com.pveronezi.ccpb.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.Calendar;

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

        //TODO para testes
        System.out.println("-------------TESTE-------------");
        memberService.cleanDb();
        for (int i = 1; i < 10; i++) {
            Member m = new Member.Builder()
                    .name("name " + i)
                    .birthday(Calendar.getInstance())
                    .maritalStatus(MaritalStatus.MERRIED)
                    .dateAdmission(Calendar.getInstance())
                    .admittedFor(AdmittedType.ACCLAIM)
                    .baptized(true)
                    .churchBaptized("Igreja universal")
                    .lastChurch("Igreja universal")
                    .function(FunctionType.DIAKONIA)
                    .email(i + i + i + i + i + "@gmail.com")
                    .photo(new byte[]{1, 1, 1, 1, 1})
                    .address(new Address.Builder()
                                    .street("Rua " + i)
                                    .number((i * 37) / 2)
                                    .city("São Paulo")
                                    .complement("apt " + i * 3)
                                    .neghborhood("Pq Bristol")
                                    .state("SP")
                                    .zipCode(i * 100111010)
                                    .build()
                    )
                    .phoneNumber(new PhoneNumber.Builder()
                                    .number(i * 101010101)
                                    .ddd(11)
                                    .type(PhoneType.CELLPHONE)
                                    .build()
                    )
                    .portfolio(new Portfolio.Builder()
                                    .baptismDate(Calendar.getInstance())
                                    .historic("historic, asdfasdfasd ,asdf ,a,sdf ,as,d asdfasdfasdf,asdf asd asdf" +
                                            "asdfasdfsdfsadsfa asdf asdfs sdfgsdf rtyjetyco jhnkju ikuj hikjuhl kjhklj " +
                                            " asdf asdfadfsdfsdfassdfadferr d tdyhmety  hymnrg fgh dhgm dghmdhgnsd ")
                                    .participatedConhecendoComuna(i % 2 == 0 ? true : false)
                                    .profession("Empresario")
                                    .theologicalTraining(TheologicalTrainingType.BACHELOR)
                                    .vocationalArea(VocationalAreaType.CHILD)
                                    .build()
                    )
                    .identification(new Identification.Builder()
                                    .bornCity("São Paulo")
                                    .bornState("SP")
                                    .fatherName("Pai do name " + i)
                                    .matherName("Mãe do name " + i)
                                    .rg("11102365")
                                    .rgDispatcher("SSP")
                                    .build()
                    ).build();

            memberService.insert(m);
        }

    }
}