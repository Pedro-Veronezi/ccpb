package br.com.pveronezi.ccpb.dao.mysql;

/**
 * Created by pveronezi on 16/03/16.
 */

import java.util.List;

import br.com.pveronezi.ccpb.domain.Member;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member, Long> {

    List<Member> findByName(String name);
}