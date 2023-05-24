package com.cris.demo.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cris.demo.model.Televisor;

@RestController
@RequestMapping("/api")
public class TvController {
	List<Televisor> lista = new ArrayList<>();
	Televisor a = new Televisor("Samsung TV", 44, 399.5);
	Televisor b = new Televisor("LG TV", 55, 599.5);
	Televisor c = new Televisor("SONY TV", 64, 999.5);

	@GetMapping
	public Televisor getTelevisor() {
		return a;
	}

	@GetMapping("/stock")
	public List<Televisor> getTelevisores() {
		agregarTelevisor(a);
		agregarTelevisor(b);
		agregarTelevisor(c);
		return lista;
	}

	@PostMapping("/stock")
	public void agregarTelevisor(@RequestBody Televisor televisor) {
		lista.add(televisor);
	}

}
