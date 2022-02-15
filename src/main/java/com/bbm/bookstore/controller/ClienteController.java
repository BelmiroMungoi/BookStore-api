package com.bbm.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping(value = "/", produces = "application/json")
	public ResponseEntity<List<Cliente>> listar(){
		List<Cliente> clientes = clienteRepository.findAll();
		
		return new ResponseEntity<List<Cliente>>(clientes, HttpStatus.OK);
	}
	
	public ResponseEntity<?> atualizar(@RequestBody Cliente cliente) {
		if (cliente.getId() == null) {
			return new ResponseEntity<String>("Cliente não encontrado! TENTE NOVAMENTE", HttpStatus.NOT_FOUND);
		}
		Cliente update = clienteRepository.saveAndFlush(cliente);
		
		return new ResponseEntity<Cliente>(update, HttpStatus.OK);
	}
}
