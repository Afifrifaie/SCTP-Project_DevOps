package com.sctp.harbourbookingapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.stereotype.Repository;

import com.sctp.harbourbookingapi.entity.Vessel;
// Edited by Afif
// @Repository
public interface VesselRepository extends JpaRepository<Vessel, Long> {
   
}

