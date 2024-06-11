package com.cliente.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cliente.entity.ClienteEntity;

@Repository
public interface IClienteRepository extends CrudRepository<ClienteEntity, Long> {

}
