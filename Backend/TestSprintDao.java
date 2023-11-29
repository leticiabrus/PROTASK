package com.scs.projetoa3jpa;

import org.junit.jupiter.api.Test;

import com.scs.projetoa3jpa.Sprints.Sprints;
import com.scs.projetoa3jpa.musica.MusicaDaoService;

import junit.framework.TestCase;

public class TestSprintDao extends TestCase {
	@Test
	public void testSprintDao() {
		Integer identifier = 5;
		String nome = "Sprint";
		String Card = "Nome do card";
		Sprints sprintEsperado = new Sprints(identifier,nome,Card);
		SprintsDaoService service = new SprintsDaoService();
		
		//test save and find one
		service.save(musicaEsperado);
		Sprints musicaEncontrado = new Sprints();
		musicaEncontrado = service.findOne(identifier);
		assertEquals(nome, sprintEncontrado.getNome());
		assertEquals(Card, sprintEncontrado.getSprint());
		assertEquals(identifier,SprintEncontrado.getId());		
		
		//test delete 
		sprintEncontrado = service.deleteById(identifier);
		assertEquals(nome, sprintEncontrado.getNome());
		assertEquals(sprint, sprintEncontrado.getBanda());
		assertEquals(identifier,sprintEncontrado.getId());				
	}
}
