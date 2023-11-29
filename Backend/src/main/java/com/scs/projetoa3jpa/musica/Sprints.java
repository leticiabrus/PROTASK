package com.scs.projetoa3jpa.musica;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Sprints {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String nome;
	private String Card;
	private String Sprint;
	
	public Sprints(Integer id, String nome, String Card, String Sprint) {
		super();
		this.id = id;
		this.nome = nome;
		this.Sprint = Sprint;
	}

	public Sprints() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sprints(int id2, String nome2, String card2, Object sprint2) {
		// TODO Auto-generated constructor stub
	}

	public Sprints(int id2, String nome2, String card2, Sprints cards) {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSprint() {
		return Sprint;
	}

	public void setSprint(String Sprint) {
		this.Sprint = Sprint;
	}

	@Override
	public String toString() {
		return "Card [id=" + id + ", nome=" + nome + ", Sprint=" + Sprint + "]";
	}

	public void add(Sprints sprints) {
		// TODO Auto-generated method stub
		
	}

	
	
	

}
