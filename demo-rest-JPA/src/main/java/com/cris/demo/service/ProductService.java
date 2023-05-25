package com.cris.demo.service;

import java.util.List;

import com.cris.demo.model.Product;

public interface ProductService {

	
	public Product getProductById(int id);
	public int getDiscountByBrand(String brand);
	public Product saveProduct(Product p);
	public void removeProduct(Product p);
	public int getProductStock(int id);
	public List<Product> getAllProducts(); //RECIBIR CATALOGO DE TODOS LOS PRODUCTOS
	public List<Product> saveProducts(List<Product> products); //SUBIR UN CATALOGO
	
}
