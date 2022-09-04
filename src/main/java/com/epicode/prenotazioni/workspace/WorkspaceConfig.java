package com.epicode.prenotazioni.workspace;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.epicode.prenotazioni.building.Building;

@Configuration
public class WorkspaceConfig {

	@Autowired @Qualifier("palazzo")
	private Building palazzo;
	@Autowired @Qualifier("hotel")
	private Building hotel;
	@Autowired @Qualifier("sede")
	private Building sede;
	@Autowired @Qualifier("sedeRoma")
	private Building sedeRoma;
	
	@Bean("salaconferenze")
	public Workspace newSala() {
		Workspace w = new Workspace();
		w.setBuilding(hotel);
		w.setDesccription("Sala conferenze");
		w.setMaxUser(20);
		w.setType(EnumWorkspaceType.BOARDROOM);
		return w;
	}

	@Bean("openspace")
	public Workspace newOpenspace() {
		Workspace w = new Workspace();
		w.setBuilding(sedeRoma);
		w.setDesccription("Open Space Sede Roma");
		w.setMaxUser(10);
		w.setType(EnumWorkspaceType.OPENSPACE);
		return w;
	}
	
	@Bean("ufficioRoma")
	public Workspace newUfficioRoma() {
		Workspace w = new Workspace();
		w.setBuilding(sedeRoma);
		w.setDesccription("Postazione singola");
		w.setMaxUser(1);
		w.setType(EnumWorkspaceType.PRIVATE);
		return w;
	}
	@Bean("ufficio")
	public Workspace newUfficio() {
		Workspace w = new Workspace();
		w.setBuilding(sede);
		w.setDesccription("Postazione singola");
		w.setMaxUser(1);
		w.setType(EnumWorkspaceType.PRIVATE);
		return w;
	}
	@Bean("coworking")
	public Workspace newCoworking() {
		Workspace w = new Workspace();
		w.setBuilding(palazzo);
		w.setDesccription("Postazione Coworking");
		w.setMaxUser(4);
		w.setType(EnumWorkspaceType.OPENSPACE);
		return w;
	}
}
