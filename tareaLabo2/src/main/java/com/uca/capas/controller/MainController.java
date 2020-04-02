package com.uca.capas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.uca.capas.domain.Usuario;

@Controller
public class MainController {
	
	@GetMapping("/login")
	public String enviarForm(Usuario usuario) {
		
		return "login";
	}
	//USUARIO: DiegoVega
	//PASS: 00148816
	@PostMapping("/validacion")
	public String procesarForm(Usuario usuario) {
		
		if(usuario.getName().equals("DiegoVega") && usuario.getPass().equals("00148816")) {
			
			return "MostrarMensajeV";
		}else {
			
			return "MostrarMensajeF";
		}
		
	}
}
