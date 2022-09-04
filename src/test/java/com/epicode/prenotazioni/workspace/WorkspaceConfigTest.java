package com.epicode.prenotazioni.workspace;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.epicode.prenotazioni.building.Building;

@Configuration
public class WorkspaceConfigTest {
	
	@Autowired @Qualifier("sedeRoma")
	private Building sedeRoma;

	@Bean("workspaceTest")
	public Workspace newOpenspace() {
		Workspace w = new Workspace();
		w.setBuilding(sedeRoma);
		w.setDesccription("Open Space Sede Roma");
		w.setMaxUser(10);
		w.setType(EnumWorkspaceType.BOARDROOM);
		return w;
	}
}
