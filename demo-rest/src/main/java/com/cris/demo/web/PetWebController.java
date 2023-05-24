package com.cris.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cris.demo.model.Mascota;

@Controller
@RequestMapping("/")
public class PetWebController {

	
		@GetMapping("/pet")
		public String getTestPet(Model model) {
			
			Mascota mascota = new Mascota("Conchista","Siames","7");
			model.addAttribute("pet",mascota);
			return "pet";
			
		}
}
