package com.sctp.harbourbookingapi.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sctp.harbourbookingapi.entity.Userid;


public interface UseridRepository extends JpaRepository<Userid, Integer> {
    Optional<Userid> findByUserid(String userid);

}
