package com.tsswebapps.tsspixserver.domain.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Contratos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
	private Long id;
	
	@OneToOne
	@JoinColumn(nullable = false, referencedColumnName = "id")
	private Parceiros parceiro;
	
	@Column(nullable = false)
	private String validade;
	
	@Column(nullable = false)
	private String keyPub;
	
	@Column(nullable = false)
	private String keyPri;
	
	@Column(nullable = false)
	private String token;
	
	@Column(nullable = false)
	private String refrshToken;
	
//	@CreationTimestamp
//	@Column(nullable = false, columnDefinition = "datetime")
//	private LocalDateTime dtCriacao;
//	
//	@UpdateTimestamp
//	@Column(nullable = false, columnDefinition = "datetime")
//	private LocalDateTime dtAlteracao;	
}
