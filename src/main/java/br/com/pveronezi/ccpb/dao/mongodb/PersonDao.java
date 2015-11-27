package br.com.pveronezi.ccpb.dao.mongodb;

import br.com.pveronezi.ccpb.bean.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by pveronezi on 19/11/15.
 */
public interface PersonDao extends MongoRepository<Person, String>{

    Person findByName(String name);
    //List<Person> getAll();
}
