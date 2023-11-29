package com.scs.projetoa3jpa.musica;

import java.net.URI;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class SprintResource {
	
	@Autowired
	private SprintsServices service;
	
	@GetMapping("/Sprints")
	public List<Sprints> retrieveAllSprints() {
		return service.findAll();
	}

	@GetMapping("/Sprints/{id}")
	public Sprints retrieveOneSprint(@PathVariable Integer id) {
		return service.findOne(id);
	}
	
	@PostMapping("/Sprints")
	public ResponseEntity<Object> createSprint(@RequestBody Sprints Sprint) {
		Sprints savedSprint = service.save(Sprint);
		
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id")
				.buildAndExpand(savedSprint.getId()).toUri();
		return ResponseEntity.created(location).build();
	}
	
	@DeleteMapping("/Sprint/{id}")
	public Sprints removeSprint(@PathVariable Integer id) {
		return service.deleteById(id);
	}

}
