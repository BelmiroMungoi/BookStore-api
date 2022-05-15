package com.bbm.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bbm.bookstore.model.Provincias;
import com.bbm.bookstore.repository.ProvinciaRepository;

@RestController
@RequestMapping(value = "/provincia")
public class ProvinciaController {
	
	@Autowired
	public ProvinciaRepository provinciaRepository;

	@GetMapping(value = "/", produces = "application/json")
	public ResponseEntity<List<Provincias>> listar(){
		List<Provincias> provincias = provinciaRepository.findAll();
		
		return new ResponseEntity<List<Provincias>>(provincias, HttpStatus.OK);
	}
}
