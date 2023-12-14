package com.br.upe.garanhuns.web.jdbc;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.domain.Persistable;

public class Usuario implements Persistable<Long> {

	@Id
	private Long id;
	private String cpf;
	private String nome;
	private String email;

	@Transient
	private boolean isNew;

	public Usuario() {
		this.setNew(true);
	}

	public Usuario(Long id, String cpf, String nome, String email) {
		this();
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public boolean isNew() {
		return this.isNew;
	}

	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}

}
