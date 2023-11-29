package com.scs.projetoa3jpa;


import org.junit.jupiter.api.Test;

import com.scs.projetoa3jpa.Sprints.Sprints;
import com.scs.projetoa3jpa.Sprints.Sprints;

import junit.framework.TestCase;

public class TestSprint extends TestCase{
	@Test
	public void testMusica() {
		Integer identifier = 5;
		String nome = "Hey Jude";
		String banda = "Beatles";
		Sprints musicaEncontrado = new Sprints();
		musicaEncontrado.setId(5);
		musicaEncontrado.setNome("Sprint 1");
		musicaEncontrado.setSprint("Cards");
		assertEquals(nome, musicaEncontrado.getNome());
		assertEquals(banda, musicaEncontrado.getSprint());
		assertEquals(identifier,musicaEncontrado.getId());
		
	}
}
