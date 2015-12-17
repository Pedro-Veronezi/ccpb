package br.com.pveronezi.ccpb.dao.mongodb;

import br.com.pveronezi.ccpb.domain.Member;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by pveronezi on 19/11/15.
 */
public interface MemberRepository extends MongoRepository<Member, String>{
    public Member findByName(String name);
    // List<Member> getAll();
}
