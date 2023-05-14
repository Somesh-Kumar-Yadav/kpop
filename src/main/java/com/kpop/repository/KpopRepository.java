package com.kpop.repository;

import com.kpop.domain.KpopDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KpopRepository extends JpaRepository<KpopDomain, Long> {

    List<KpopDomain> findAll();

}
