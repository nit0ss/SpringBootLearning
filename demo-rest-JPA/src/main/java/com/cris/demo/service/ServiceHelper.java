package com.cris.demo.service;

import com.cris.demo.entity.ProductEntity;
import com.cris.demo.model.Product;

public class ServiceHelper {

	public static Product getProductFromEntity(ProductEntity productEntity) {
        Product product = new Product();
        product.setId(productEntity.getId());
        product.setBrand(productEntity.getBrand());
        product.setModel(productEntity.getModel());
        product.setPrice(productEntity.getPrice());
        product.setDescription(productEntity.getDescription());
        product.setImage(productEntity.getImage());
        product.setStock(productEntity.getStock());
        return product;
    }
    
    public static ProductEntity getEntityFromProduct(Product product) {
        ProductEntity productEntity = new ProductEntity();
        productEntity.setBrand(product.getBrand());
        productEntity.setModel(product.getModel());
        productEntity.setPrice(product.getPrice());
        productEntity.setDescription(product.getDescription());
        productEntity.setImage(product.getImage());
        productEntity.setStock(product.getStock());
        return productEntity;
    }
}
