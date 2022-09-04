package com.epicode.prenotazioni.reservation;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.epicode.prenotazioni.user.User;
import com.epicode.prenotazioni.workspace.Workspace;

@Configuration
public class ReservationConfig {

	@Autowired @Qualifier("fraverdi")
	private User verdi;
	@Autowired @Qualifier("maxbianchi")
	private User bianchi;

	@Autowired @Qualifier("ufficio")
	private Workspace ufficio;
	@Autowired @Qualifier("coworking")
	private Workspace coworking;
	
	@Bean("res1")
	public Reservation res1() {
		Reservation res = new Reservation();
		res.setUser(verdi);
		res.setWorkspace(ufficio);
		res.setReservationDate(LocalDate.now());
		return res;
	}
	@Bean("res2")
	public Reservation res2() {
		Reservation res2 = new Reservation();
		res2.setUser(verdi);
		res2.setWorkspace(coworking);
		res2.setReservationDate(LocalDate.now());
		return res2;
	}
	@Bean("res3")
	public Reservation res3() {
		Reservation res3 = new Reservation();
		res3.setUser(bianchi);
		res3.setWorkspace(ufficio);
		res3.setReservationDate(LocalDate.now());
		return res3;
	}
}
