package com.cris.demo.model;

public class Televisor {
	private String modelo;
	private int pulgadas;
	private double precio;
	public Televisor(String modelo, int pulgadas, double precio) {
		super();
		this.modelo = modelo;
		this.pulgadas = pulgadas;
		this.precio = precio;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getPulgadas() {
		return pulgadas;
	}
	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Televisor [modelo=" + modelo + ", pulgadas=" + pulgadas + ", precio=" + precio + "]";
	}
	
	

}
