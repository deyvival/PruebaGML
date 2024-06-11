package com.cliente.entity;

import java.io.Serializable;

import javax.persistence.*;
import lombok.*;


@Entity
@Table(name = "cliente")
@Data
public class ClienteEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String documentClient;
	@Column
	private String nameClient;
	@Column
	private String telClient;
     @Column
	private String mailClient;

}
