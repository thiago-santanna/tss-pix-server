
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
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;

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
	@JoinColumn(name = "banco_id", nullable = false, referencedColumnName = "id")
	private Banco banco;
	
	@Column(nullable = false)
	private String conta;
	
	@Column(nullable = false)
	private String agencia;
	
	@NotBlank
	@Column(name = "chave_pix")
	private String chavePix;	
	
	@NotBlank
	@Column
	private String cnpj;
	
	@NotBlank
	@Column
	private String cpf;
	
	@NotBlank
	@Column(name = "client_id")
	private String clientId;
	
	@NotBlank
	@Column(name = "client_secret")
	private String clientSecret;
	
	@Column(nullable = false)
	private String email;	
	
	@Column
	private String telefone;
	
	@NotBlank
	@Column(name = "token_jwt")
	private String tokenJwt;
	
	@Column(nullable = false)
	private String numEndereco;
	
	@Column
	private String complementoEndereco;
	
	@OneToOne
	@JoinColumn(name = "rua_id", nullable = false, referencedColumnName = "id")
	private Rua rua;
	
//	@CreationTimestamp
//	@Column(nullable = false, columnDefinition = "datetime")
//	private LocalDateTime dtCriacao;
//	
//	@UpdateTimestamp
//	@Column(nullable = false, columnDefinition = "datetime")
//	private LocalDateTime dtAlteracao;
	
	@Column(nullable = false)
	private Situacao situacao;
}
