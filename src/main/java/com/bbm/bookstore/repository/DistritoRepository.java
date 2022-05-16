package com.bbm.bookstore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bbm.bookstore.model.Distritos;

@Repository
public interface DistritoRepository extends JpaRepository<Distritos, Long>{

	@Query(nativeQuery = true, value = "SELECT * FROM distritos WHERE provincia_id = ?1")
	List<Distritos> findDistritoById(Long id);
}
