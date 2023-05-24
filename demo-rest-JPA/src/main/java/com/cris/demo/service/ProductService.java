package com.cris.demo.service;

import com.cris.demo.entity.ProductEntity;
import com.cris.demo.model.Product;

public interface ProductService {

	
	public Product getProductById(int id);
	public int getDiscountByBrand(String brand);
	public Product saveProduct(Product p);
	public void removeProduct(Product p);
	public int getStock(int id);
	
}
