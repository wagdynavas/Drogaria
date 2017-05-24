package com.navasgroup.drogaria.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.navasgroup.drogaria.domain.City;
import com.navasgroup.drogaria.domain.Person;


public class PersonDAOTest {
	
	@Ignore
	@Test
	public void save() {
		CityDAO cityDAO = new CityDAO();
		City city = cityDAO.search(1L);
		
		Person person = new Person();
		person.setName("Wagdy Navas");
		person.setPassportNumber("FK08089");
		person.setIdNumber("411997580");
		person.setStreet("Peixoto Werneck");
		person.setNumber(new Short("433"));
		person.setRegion("Artur Alvim");
		person.setPostCode("08015254");
		person.setComplement("ap 41");
		person.setCellPhone("11981693386");
		person.setEmail("dinholelles@gmail.com");
		person.setCity(city);
		
		PersonDAO personDAO = new PersonDAO();
		personDAO.save(person);
	}
	
	@Ignore
	@Test
	public void list(){
		
		PersonDAO personDAO = new PersonDAO();
		List<Person> listOfPerson = personDAO.list();
		
		for(Person person : listOfPerson){
			System.out.println(person);
		}
	}
}
