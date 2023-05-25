package com.cris.demo.service;

import java.util.ArrayList;
import java.util.List;
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
		Product product = null;
		Optional<ProductEntity> optProduct = productRepository.findById(id);
		if (optProduct.isPresent()) {
			product = ServiceHelper.getProductFromEntity(optProduct.get());
		}
		return product;
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
	public Product saveProduct(Product product) {
		ProductEntity productEntity = ServiceHelper.getEntityFromProduct(product);
		return ServiceHelper.getProductFromEntity(productRepository.save(productEntity));
	}

	@Override
	public void removeProduct(Product p) {

		ProductEntity product = ServiceHelper.getEntityFromProduct(p);
		productRepository.delete(product);

	}

	@Override
	public int getProductStock(int id) {
		Optional<ProductEntity> optProduct = productRepository.findById(id);
		if (optProduct.isPresent()) {
			return optProduct.get().getStock();
		}
		return 0;

	}

	@Override
	public List<Product> getAllProducts() {
		List<Product> products = new ArrayList<>();
		List<ProductEntity> productEntities = productRepository.findAll();
		for (ProductEntity entity : productEntities) {
			products.add(ServiceHelper.getProductFromEntity(entity));
		}
		return products;
	}

	@Override
	public List<Product> saveProducts(List<Product> products) {
		List<Product> savedProducts = new ArrayList<>();
		for (Product product : products) {
			ProductEntity productEntity = ServiceHelper.getEntityFromProduct(product);
			savedProducts.add(ServiceHelper.getProductFromEntity(productRepository.save(productEntity)));
		}
		return savedProducts;
	}

}
