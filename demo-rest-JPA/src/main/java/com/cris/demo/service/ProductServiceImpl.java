package com.cris.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cris.demo.data.ProductRepository;
import com.cris.demo.entity.ProductEntity;
import com.cris.demo.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	public ProductRepository productRepository;

	@Override
	public Product getProductById(int id) {
		Product p = null;
		Optional<Product> optProduct = productRepository.findById(id);
		if (optProduct.isPresent()) {
			p = ServiceHelper.getProductFromEntity(optProduct.get());
		}
		return p;
	}

	@Override
	public int getDiscountByBrand(String brand) {
		if (brand.startsWith("a")) {
			return 10;
		} else
			return 0;
	}
	/*
	 * @Override public ProductEntity saveProduct(Product p) { ProductEntity
	 * productEntity = ServiceHelper.getEntityFromProduct(p); return
	 * productRepository.save(productEntity); }
	 */

	@Override
	public Product saveProduct(Product p) {
		
		return productRepository.save(p);
	}

	@Override
	public void removeProduct(Product p) {

		
		productRepository.delete(p);

	}

	@Override
	public int getStock(int id) {
		Optional<Product> optProduct = productRepository.findById(id);
		if (optProduct.isPresent()) {
			return optProduct.get().getStock(id);
		}
		return 0;

	}
}
