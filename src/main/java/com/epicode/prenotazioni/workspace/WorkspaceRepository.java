package com.epicode.prenotazioni.workspace;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkspaceRepository extends CrudRepository<Workspace, Long> {

	@Query("SELECT w FROM Workspace w WHERE w.building.address.city =:city AND w.type =:type")
	public List<Workspace> findByCityAndType(String city, EnumWorkspaceType type);
	
}
