package com.epicode.prenotazioni.building;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Order(1)
@Slf4j
public class BuildingRunner implements ApplicationRunner {

	@Autowired @Qualifier("palazzo")
	private Building palazzo;
	@Autowired @Qualifier("hotel")
	private Building hotel;
	@Autowired @Qualifier("sede")
	private Building sede;
	@Autowired @Qualifier("sedeRoma")
	private Building sedeRoma;
	@Autowired
	BuildingService serv;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		log.info("Creating buildings...");
		serv.create(hotel);
		serv.create(palazzo);
		serv.create(sede);
		serv.create(sedeRoma);
		log.info("--------Buildings created--------");
		
	}

}
