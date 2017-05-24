package com.navasgroup.drogaria.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.navasgroup.drogaria.domain.State;

public class StateDAOTest {
	@Test
	//@Ignore// Ignora um teste caso vc queira
	public void save(){
		State state = new State();
		state.setName("Minas Gerais");
		state.setInitials("MG");
		
		StateDAO stateDAO = new StateDAO();
		stateDAO.save(state);
	}
	
	@Test
	@Ignore
	public void list(){
		StateDAO stateDAO = new StateDAO();
		List<State> result = stateDAO.list();
		
		for (State state : result) {
			System.out.println( state.getInitials() +"-"+state.getName());
		}
	}
	
	@Ignore
	@Test
	public void search(){
		Long code = 2L;
		StateDAO estadoDAO = new StateDAO();
		
		State state = estadoDAO.search(code);
		
		if(state == null){
			System.out.println("State not found!");
		}else{
			System.out.println( state.getInitials() +"-"+state.getName());
		}
	
	}
	
	@Test
	@Ignore
	public void delete(){
		Long code = 2L;
		StateDAO stateDAO = new StateDAO();
		State state = stateDAO.search(code);
		
		if(state == null){
			System.out.println("You have to choose somethig to delete!");
		}else {
			stateDAO.delete(state);
		}
		
		
	}
	
	@Ignore
	@Test
	public void update(){
		Long code = 1L;
		StateDAO stateDAO = new StateDAO();
		State state = stateDAO.search(code);
		
		if(state == null){
			System.out.println("You have to choose somethig to update!");
		}else {
			state.setName("Sao Paulo");
			state.setInitials("SP");
			stateDAO.update(state);
			System.out.println( state.getInitials() +"-"+state.getName());
		}
	}
	 
}
