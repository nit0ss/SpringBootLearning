package com.cris.demo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cris.demo.model.Product;
import com.cris.demo.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductApiController {
	
	@Autowired
	ProductService productService;
	
	@PostMapping("/product")
	public Product saveProduct(@RequestBody Product product) {
		return productService.saveProduct(product);
	}
	
	@PostMapping("/products")
	public List<Product> saveProducts(@RequestBody List<Product> products) {
	    return productService.saveProducts(products);
	}

	
	
	@GetMapping("/product/{id}")
	public Product getProductById(@PathVariable("id") Integer id) {
		return productService.getProductById(id);
	}
	@GetMapping("/product/catalog")
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}
	
	
}
