package com.br.upe.garanhuns.web;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.br.upe.garanhuns.web.jdbc.Usuario;
import com.br.upe.garanhuns.web.jdbc.UsuarioRepositorio;

@SpringBootTest
@TestPropertySource("classpath:application-teste.properties")
public class UsuarioRepositorioTeste {

	@Autowired
	private UsuarioRepositorio usuarioRepo;

	@Test
	public void quandoSalvaClienteEntaoClientePersistido() {
		Usuario usuario = new Usuario(1L, "12345678912", "Guilherme", "teste@gmail.com");

		this.usuarioRepo.save(usuario);

		Usuario usuarioSalvo = this.usuarioRepo.findById(1L).get();
		assertNotNull(usuarioSalvo, "Deveria ter salvo o cliente");
	}

	@BeforeEach
	public void limpaBase() {
		this.usuarioRepo.deleteAll();
	}

}
