package com.epicode.prenotazioni.workspace;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.epicode.prenotazioni.building.Building;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Workspace {

	@Id
	@GeneratedValue
	private Long id;
	private String desccription;
	@Enumerated(EnumType.STRING)
	private EnumWorkspaceType type;
	private Integer maxUser;
	@ManyToOne
	private Building building;
	
}
