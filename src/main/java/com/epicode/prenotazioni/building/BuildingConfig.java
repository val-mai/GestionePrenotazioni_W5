package com.epicode.prenotazioni.building;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.epicode.prenotazioni.address.Address;
import com.epicode.prenotazioni.address.AddressService;

@Configuration
public class BuildingConfig {

	@Autowired
	AddressService addrServ;
	@Autowired
	ObjectProvider<Address> addrProvider;
	
	@Bean("palazzo")
	public Building newPalazzo() {
		Address a = addrProvider.getObject();
		addrServ.create(a);
		Building b = new Building();
		b.setAddress(a);
		b.setName("Palazzo Verdi");
		return b;
	}
	
	@Bean("sedeRoma")
	public Building newSedeRoma() {
		Address a = new Address(null, "Roma", "Via Marconi 49", "Roma");
		addrServ.create(a);
		Building b = new Building();
		b.setAddress(a);
		b.setName("Sede Roma");
		return b;
	}
	
	@Bean("hotel")
	public Building newHotel() {
		Address a = addrProvider.getObject();
		addrServ.create(a);
		Building b = new Building();
		b.setAddress(a);
		b.setName("Hotel Bellagio");
		return b;
	}
	
	@Bean("sede")
	public Building newSede() {
		Address a = addrProvider.getObject();
		addrServ.create(a);
		Building b = new Building();
		b.setAddress(a);
		b.setName("Sede Principale");
		return b;
	}

}
