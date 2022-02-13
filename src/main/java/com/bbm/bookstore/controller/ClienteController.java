package com.bbm.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bbm.bookstore.model.Cliente;
import com.bbm.bookstore.repository.ClienteRepository;

@RestController
@RequestMapping(value = "/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;

	@PostMapping(value = "/", produces = "application/json")
	public ResponseEntity<Cliente> salvar(@RequestBody Cliente cliente){
		Cliente saveCliente = clienteRepository.save(cliente);
		
		return new ResponseEntity<Cliente>(saveCliente, HttpStatus.CREATED);
	}
}
