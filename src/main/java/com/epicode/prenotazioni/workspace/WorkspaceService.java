package com.epicode.prenotazioni.workspace;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class WorkspaceService {
	
	@Autowired
	private WorkspaceRepository repo;
	
	
	public List<Workspace> getAllWorkspaces() {
		return (List<Workspace>) repo.findAll();
	}
	
	public Workspace findById(Long id) {
		return repo.findById(id).get();
	}
	
	public void deleteWorkspace(Long id) {
		repo.deleteById(id);
	}
	
	public void create(Workspace workspace) {
		repo.save(workspace);
	}
	
	public void edit(Workspace workspace) {
		repo.save(workspace);
	}

	public List<Workspace> getWorkspaceByCityAndType(String city, EnumWorkspaceType type){
		List<Workspace> found = repo.findByCityAndType(city, type);
		log.info("{} workspace in {} found:", found.size(), city);
		for (Workspace workspace : found) {
			log.info("{} - {} - {}", workspace.getDesccription(), workspace.getBuilding().getAddress().getCity(), workspace.getBuilding().getAddress().getStreet()); 
		}
		return found;
	}
}
