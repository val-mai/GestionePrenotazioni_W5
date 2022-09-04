package com.epicode.prenotazioni.reservation;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epicode.prenotazioni.user.User;
import com.epicode.prenotazioni.workspace.Workspace;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {

	List<Reservation> findByWorkspaceAndReservationDate(Workspace w, LocalDate date);
	
	List<Reservation> findByUserAndReservationDate(User u, LocalDate date);

}
