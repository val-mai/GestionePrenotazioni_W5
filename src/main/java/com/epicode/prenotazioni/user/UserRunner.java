package com.epicode.prenotazioni.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Order(3)
@Slf4j
public class UserRunner implements ApplicationRunner {

	@Autowired @Qualifier("mariorossi")
	private User rossi;
	@Autowired @Qualifier("maxbianchi")
	private User bianchi;
	@Autowired @Qualifier("fraverdi")
	private User verdi;
	@Autowired
	UserService userServ;
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		log.info("Creating users...");
		userServ.create(bianchi);
		userServ.create(rossi);
		userServ.create(verdi);
		log.info("--------Users created--------");
	}

}
