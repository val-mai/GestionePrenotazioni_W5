package com.epicode.prenotazioni.user;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
	
	@Bean("mariorossi")
	public User marioRossi() {
		User u = new User();
		u.setCompleteName("Mario Rossi");
		u.setEmail("mario.rossi@gmail.com");
		u.setUsername("mrossi");
		return u;
	}
	@Bean("maxbianchi")
	public User maxBianchi() {
		User u = new User();
		u.setCompleteName("Massimiliano Biachi");
		u.setEmail("max_bianchi@hotmail.it");
		u.setUsername("maxB");
		return u;
	}
	@Bean("fraverdi")
	public User newUser() {
		User u = new User();
		u.setCompleteName("Francesca Verdi");
		u.setEmail("verdi.fra@gmail.com");
		u.setUsername("fragreen");
		return u;
	}
}
