package com.bbm.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bbm.bookstore.model.Distritos;

@Repository
public interface DistritoRepository extends JpaRepository<Distritos, Long>{

}
