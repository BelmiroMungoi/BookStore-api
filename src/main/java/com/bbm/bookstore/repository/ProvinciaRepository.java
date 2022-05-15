package com.bbm.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bbm.bookstore.model.Provincias;

@Repository
public interface ProvinciaRepository extends JpaRepository<Provincias, Long>{

}
