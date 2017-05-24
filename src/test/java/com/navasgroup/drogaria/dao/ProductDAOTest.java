package com.navasgroup.drogaria.dao;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.navasgroup.drogaria.domain.Manufacturer;
import com.navasgroup.drogaria.domain.Product;

public class ProductDAOTest {
	@Test
	//@Ignore
	public void save(){
		Long code = 1L;
		
		ManufacturerDAO manufacturerDAO = new ManufacturerDAO();
		Manufacturer manufacturer = manufacturerDAO.search(code);
		
		Product product = new Product();
		product.setDescription("Moto Z Play");
		product.setManufacturer(manufacturer);
		product.setPrice(new BigDecimal("3000.00"));// vc nao pode apenas colocar um número real
		product.setQuantity(new Short("30"));
		
		ProductDAO productDAO = new ProductDAO();
		productDAO.save(product);
		
		System.out.println(product.getQuantity()  
				+ " Product " + product.getDescription() + " has been saved with success");
	}
	
	@Test
	@Ignore
	public void list(){
		
		ProductDAO productDAO = new ProductDAO();
		List<Product> list = productDAO.list();
		
		for(Product product : list){
			System.out.println("Products: " + product.getDescription());
	
		}
	}
	
	@Test
	@Ignore
	public void search(){
		Long code = 1L;
		
		ProductDAO productDAO = new ProductDAO();
		Product product = productDAO.search(code);
		
		if(product == null){
			System.out.println("Product not found!");
		}else{
			System.out.println(product);
		}
	}
	
	@Test
	@Ignore
	public void delete(){
		Long code = 1L;
		
		ProductDAO productDAO = new ProductDAO();
		Product product = productDAO.search(code);
		
		if(product == null){
			System.out.println("Product not found!");
		}else {
			productDAO.delete(product);
		}
	}
	
	@Ignore
	@Test
	public void update(){
		Long code = 2L;
		
		ProductDAO productDAO = new ProductDAO();
		Product product = productDAO.search(code);
		
		if(product == null){
			System.out.println("Product not found!");
		}else{
			
			product.setDescription("Moto X force");
			product.setPrice(new BigDecimal("1850.50"));
			productDAO.update(product);
			System.out.println("Product has been updated.");
			System.out.println(product);
		}
	}
}
