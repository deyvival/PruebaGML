package com.cliente.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cliente.entity.ClienteEntity;
import com.cliente.repository.IClienteRepository;
import com.cliente.repository.IClienteService;

@Service
public class ClienteService implements IClienteService {
	
	@Autowired
	private IClienteRepository clienteRepository;
	
	public List<ClienteEntity> getCliente() {
		return (List<ClienteEntity>) clienteRepository.findAll();
	}

}
