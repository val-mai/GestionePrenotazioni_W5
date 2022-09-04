package com.epicode.prenotazioni.workspace;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Order(2)
@Slf4j
public class WorkspaceRunner implements ApplicationRunner {

	@Autowired @Qualifier("salaconferenze")
	private Workspace conf;
	@Autowired @Qualifier("openspace")
	private Workspace openspace;
	@Autowired @Qualifier("ufficio")
	private Workspace ufficio;
	@Autowired @Qualifier("ufficioRoma")
	private Workspace ufficioRoma;
	@Autowired @Qualifier("coworking")
	private Workspace coworking;
	
	@Autowired
	private WorkspaceService workService;
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		log.info("Creating workspaces...");
		workService.create(conf);
		workService.create(openspace);
		workService.create(ufficio);
		workService.create(ufficioRoma);
		workService.create(coworking);	
		log.info("--------Workspaces created--------");
		
		workService.getWorkspaceByCityAndType("Roma", EnumWorkspaceType.OPENSPACE);
		
	}

}
