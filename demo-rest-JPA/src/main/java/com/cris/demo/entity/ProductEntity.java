package com.cris.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String brand;
	private String model;
	private float price;
	private String description;
	private String image;
	private int stock;

	public ProductEntity() {
	}; // El constructor vacio por defecto

	/*
	 * public Product(String brand, String model, float price, String description,
	 * String image) { super(); this.brand = brand; this.model = model; this.price =
	 * price; this.description = description; this.image = image; }
	 */
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getId() {
		return id;
	}

	public int getStock(int id) {
		return stock;
	}

	@Override
	public String toString() {
		return "Product [brand=" + brand + ", model=" + model + ", price=" + price + ", description=" + description
				+ ", image=" + image + "]";
	}

}
