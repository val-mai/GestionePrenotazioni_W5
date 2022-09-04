package com.epicode.prenotazioni.workspace;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

@SpringBootTest
public class WorkspaceRepositoryTest {

	@Autowired @Qualifier("workspaceTest")
	private Workspace w;
	
	@Autowired
	private WorkspaceRepository repo;
	
	@Test
	public void findByCityAndTypeSuccess() {
		
		repo.save(w);
		List<Workspace> found = repo.findByCityAndType("Roma", EnumWorkspaceType.BOARDROOM);

		assertThat(found).isNotEmpty();
	}
	
	@Test
	public void findByCityAndTypeNotFound() {
		
		List<Workspace> found = repo.findByCityAndType("RM", EnumWorkspaceType.BOARDROOM);
		
		assertThat(found).isEmpty();
	}
	
}
