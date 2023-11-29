package com.scs.projetoa3jpa.musica;

import java.net.URI;
import java.util.List;
import java.util.Optional;


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
public class SprintsJPAResource {
	@Autowired
	private SprintsRepository CardRepository;

	@GetMapping("/jpa/Sprints")
	public List<Sprints> retrieveAllMusicas(){
		List<Sprints> Sprints = SprintsRepository.findAll();
		
		return Sprints;
	}
	/*
	@GetMapping("/jpa/musicas/{id}")
	public EntityModel<Musica> retrieveMusica(@PathVariable int id) {
		Optional<Musica> musica = musicaRepository.findById(id);
		
		//if (!user.isPresent()) {
		//	throw new UserNotFoundException("id-"+ id);
		//}
		
		//"all-users", SERVER_PATH + "/users"
		//retrieveAllUsers
		EntityModel<Musica> resource = EntityModel.of(musica.get());
		WebMvcLinkBuilder linkTo = linkTo(methodOn(this.getClass()).retrieveAllMusicas());
		resource.add(linkTo.withRel("all-musicas"));
		//HATEOAS
			
		return resource;
	}
	*/
	@DeleteMapping("/jpa/Sprints/{id}")
	public void deleteUser(@PathVariable int id) {
		CardRepository.deleteById(id);
	}
	
	@PostMapping("/jpa/musicas")
	public ResponseEntity<Object> createUser(@RequestBody Sprints Sprint) {
		Sprints savedMusica = new Sprints(null, null, null, null);
		
		URI location = ServletUriComponentsBuilder
			.fromCurrentRequest()
			.path("/{id}")
			.buildAndExpand(savedMusica.getId()).toUri();
		return ResponseEntity.created(location).build();
	}
	

}
