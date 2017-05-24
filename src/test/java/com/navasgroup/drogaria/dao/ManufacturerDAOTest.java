package com.navasgroup.drogaria.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.navasgroup.drogaria.domain.Manufacturer;

public class ManufacturerDAOTest {
	@Test
	//@Ignore
	public void save(){
		Manufacturer manufacturer = new Manufacturer();
		manufacturer.setDescription("Lenovo");
		
		ManufacturerDAO  manufacturerDAO = new ManufacturerDAO();
		manufacturerDAO.save(manufacturer);
	}
	
	@Test
	@Ignore
	public void list(){
		
		ManufacturerDAO manufacturerDAO = new ManufacturerDAO();
		List<Manufacturer> result = manufacturerDAO.list();
		
		for(Manufacturer manufacturer : result){
			System.out.println("Manufacturer - " + manufacturer.getDescription());
		}
	}
	@Ignore
	@Test
	public void search(){
		Long code = 1L;
		
		ManufacturerDAO manufacturerDAO = new ManufacturerDAO();
		Manufacturer manufacturer = manufacturerDAO.search(code);
		
		if(manufacturer == null){
			System.out.println("Manufacturer not found!");
		}else{
			System.out.println(manufacturer.getDescription());
		}
		
	}
	
	@Ignore
	@Test
	public void delete(){
		Long code= 1L;
		
		ManufacturerDAO manufacturerDAO = new ManufacturerDAO();
		Manufacturer manufacturer = manufacturerDAO.search(code);
		
		if(manufacturer == null){
			System.out.println("Manufacturer not found!");
		}else{
			System.out.println("Manufacturer deleted - " + manufacturer.getDescription());
			manufacturerDAO.delete(manufacturer);
		}
	}
	
	@Test
	public void update(){
		Long code = 2L;
		
		ManufacturerDAO manufacturerDAO = new ManufacturerDAO();
		Manufacturer manufacturer = manufacturerDAO.search(code);
		
		
		if(manufacturer == null){
			System.out.println("Manufacturer not found!");
		}else{
			System.out.println("Manufacturer " + manufacturer.getDescription() + " has beem updated - ");
			manufacturer.setDescription("Lenovo");
			manufacturerDAO.update(manufacturer);
			System.out.println("New Manufacturer - " + manufacturer.getDescription());
		}
	}
}
