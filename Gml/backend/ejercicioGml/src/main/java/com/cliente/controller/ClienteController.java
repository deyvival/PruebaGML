package com.cliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cliente.entity.ClienteEntity;
import com.cliente.repository.IClienteService;

@RestController
@RequestMapping(value="listaClientes")
public class ClienteController {
	
	@Autowired
	private IClienteService clienteService;

	@GetMapping(value="cliente")
	public List<ClienteEntity> getCliente() {
		return clienteService.getCliente();
	}

}
