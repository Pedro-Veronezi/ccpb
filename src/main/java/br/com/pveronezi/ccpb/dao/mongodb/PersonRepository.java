package br.com.pveronezi.ccpb.dao.mongodb;

import br.com.pveronezi.ccpb.bean.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by pveronezi on 19/11/15.
 */
public interface PersonRepository extends MongoRepository<Person, String>{
    public Person findByName(String name);
    // List<Person> getAll();
}
