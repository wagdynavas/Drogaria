package com.navasgroup.drogaria.dao;


import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.navasgroup.drogaria.domain.City;
import com.navasgroup.drogaria.domain.State;

public class CItyDAOTest {
	
	@Test
	//@Ignore
	public void save(){
		/*Como city possui uma chave extrangeira, faca uma pesquisa primeiro, depois salve*/
		StateDAO stateDAO = new StateDAO();
		State state = stateDAO.search(1L);
		
		City city = new City();
		city.setName("Casa Branca");
		city.setState(state);
		
		CityDAO cityDAO = new CityDAO();
		cityDAO.save(city);
		
		
	}
	
	@Test
	@Ignore
	public void list(){
		CityDAO cityDAO = new CityDAO();
		List<City> result = cityDAO.list();
		
		for(City city : result){
			System.out.println(city.getName());
		}
	}
	
	
	@Test
	@Ignore
	public void search(){
		Long code = 1L;
		
		CityDAO cityDAO = new CityDAO();
		City city = cityDAO.search(code);
		
		if(city == null){
			System.out.println("City not found!");
		}else{
			System.out.println(city.getName());
		}
	}
	
	
	@Test
	@Ignore
	public void delete(){
		Long code = 2L;
		
		CityDAO cityDAO = new CityDAO();
		City city = cityDAO.search(code);
		
		if(city == null){
			System.out.println("City not found!");
		}else{
			cityDAO.delete(city);
		}
		
	}
	
	@Test
	public void update(){
		Long code = 2L;
		
		CityDAO cityDAO = new CityDAO();
		City city = cityDAO.search(code);
		
		if(city == null){
			System.out.println("City not found!");
		}else{
			System.out.println(city.getName() + " was updated!");
			city.setName("Mauá");
			cityDAO.update(city);
			System.out.println("New city is " + city.getName());
		}
		
		
		
	}
}
