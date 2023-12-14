package com.br.upe.garanhuns.web.jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(schema = "jpa")
public class Pessoa {

	@Id
	@Column(name = "id_pessoa")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false, unique = true, length = 300)
	private String nome;

	@Lob
	private byte[] foto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	@Override
	public boolean equals(Object obj) {
		boolean iguais = false;
		if (this == obj) {
			iguais = true;
		} else if (obj instanceof Pessoa) {
			Pessoa pessoa = (Pessoa) obj;
			if (this.getNome() != null) {
				iguais = this.getNome().equalsIgnoreCase(pessoa.getNome());
			}
		}

		return iguais;
	}
}
