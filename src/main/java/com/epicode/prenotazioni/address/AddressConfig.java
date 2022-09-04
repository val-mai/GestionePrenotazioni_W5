package com.epicode.prenotazioni.address;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.github.javafaker.Faker;

@Configuration
public class AddressConfig {

	Faker faker = Faker.instance(new Locale("it-IT"));
	
	@Bean
	@Scope("prototype")
	public Address newAddress() {
		Address a = new Address();
		a.setCity(faker.address().cityName());
		a.setStreet(faker.address().streetAddress());
		a.setProvince(faker.address().state());
		return a;
	}
}
