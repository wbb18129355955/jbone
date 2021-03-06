package com.majunwei.jbone.sys.dao.repository;

import com.majunwei.jbone.sys.dao.domain.RbacUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface RbacUserRepository extends JpaRepository<RbacUserEntity,Integer>,JpaSpecificationExecutor<RbacUserEntity>{
    RbacUserEntity findByUsername(String username);
}
