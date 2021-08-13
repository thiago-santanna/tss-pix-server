package com.tsswebapps.tsspixserver.domain.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.tsswebapps.tsspixserver.domain.enums.Situacao;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Clientes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	@ManyToOne
	@JoinColumn(nullable = false, referencedColumnName = "id")
	private Banco banco;
	
	@Column(nullable = false)
	private String conta;
	
	@Column(nullable = false)
	private String agencia;
	
	@Column(nullable = false)
	private String chavePix;	
	
	@Column(nullable = false)
	private String cnpj;
	
	@Column(nullable = false)
	private String cpf;
	
	@Column(nullable = false)
	private String clientId;
	
	@Column(nullable = false)
	private String clientSecret;
	
	@Column(nullable = false)
	private String email;	
	
	@Column
	private String tokenJwt;
	
	@Column(nullable = false)
	private String numEndereco;
	
	@Column
	private String complementoEndereco;
	
	@OneToOne
	@JoinColumn(nullable = false, referencedColumnName = "id")
	private Rua endereco;
	
	@OneToMany
	@JoinColumn(nullable = false, referencedColumnName = "id")
	private List<Telefone> telefone = new ArrayList<>();	
	
	@CreationTimestamp
	@Column(nullable = false, columnDefinition = "datetime")
	private LocalDateTime dtCriacao;
	
	@UpdateTimestamp
	@Column(nullable = false, columnDefinition = "datetime")
	private LocalDateTime dtAlteracao;
	
	@Column(nullable = false)
	private Situacao situacao;
}
