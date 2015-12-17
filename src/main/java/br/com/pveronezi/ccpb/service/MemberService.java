package br.com.pveronezi.ccpb.service;

import br.com.pveronezi.ccpb.dao.mongodb.MemberRepository;
import br.com.pveronezi.ccpb.domain.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by pveronezi on 19/11/15.
 */
@Service
public class MemberService {
    @Autowired
    private MemberRepository repository;

    public List<Member> getAll(){
        return repository.findAll();
    }

    public Member update(Member member){
        return repository.save(member);
    }
    public Member insert(Member member){
        member.setId(null);
        return repository.save(member);
    }

    public Member get(String id){
        return repository.findOne(id);
    }
    public void delete(Member m){
        repository.delete(m);
    }

    // TODO remover depois dos testes
    public void cleanDb() {
        repository.deleteAll();
    }
}
