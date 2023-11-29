package com.scs.projetoa3jpa.musica;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

@Component
public class SprintsServices {
	private static final List<com.scs.projetoa3jpa.musica.Sprints> Sprint = null;

	private static List<Sprints> Sprints = new ArrayList<>();
	
	private int CardsCount = 3;
	
	static {
		Sprints.add(new Sprints(CardsCount, null, null, CardsCount));
		Sprints.add(new Sprints(CardsCount, null, null, CardsCount));
		Sprints.add(new Sprints(CardsCount, null, null, CardsCount));
	}
	
	public List<Sprints> findAll () {
		return Sprint;
	}
	
	public Sprints save(Sprints Sprints) {
		if (Sprints.getId() == 0) {
			int SprintsCount = 0;
			Sprints.setId(++SprintsCount);
		}
		Sprints.add(Sprints);
		return Sprints;
	}
	
	public Sprints findOne(Integer id) {
		for (Sprints Sprint:Sprints) {
			if (Sprint.getId() == id) {
				return Sprint;
			}
		}
		return null;
	}
	
	public Sprints deleteById(Integer id) {
		Iterator<Sprints> iterator = Sprints.iterator();
		while (iterator.hasNext()) {
			Sprints Sprints = iterator.next();
			if (Sprints.getId() == id) {
				iterator.remove();
				return Sprints;
			}
		}
		return null;		
	}
}
