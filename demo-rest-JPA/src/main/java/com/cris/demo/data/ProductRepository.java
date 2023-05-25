package com.cris.demo.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cris.demo.entity.ProductEntity;
import com.cris.demo.model.Product;


public interface ProductRepository extends JpaRepository<ProductEntity, Integer>{

	

	



}
