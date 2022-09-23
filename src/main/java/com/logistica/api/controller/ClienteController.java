package com.logistica.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.logistica.api.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		Cliente cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("João");
		Cliente cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("MAria");
		
		
		return Arrays.asList(cliente1, cliente2) ;
	}
}
