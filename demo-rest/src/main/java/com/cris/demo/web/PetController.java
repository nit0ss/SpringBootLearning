package com.cris.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cris.demo.model.Mascota;

//para apirest

@RestController
@RequestMapping("/api")
public class PetController {
	
	
	@GetMapping //lama al metodo con getmaping cuando accede
	public Mascota getMascota() {
		Mascota a = new Mascota("Jack","Perro Normal","7");
		return a;
	}
	
	
	
	
}
