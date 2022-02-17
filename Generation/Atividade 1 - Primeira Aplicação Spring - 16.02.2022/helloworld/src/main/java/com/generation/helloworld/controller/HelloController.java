package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 1º notação apertar Ctrl+Shift+O importa a notação assima para indicar que esta classe é do tipo controladora
@RequestMapping("/hello") // 
public class HelloController {

	@GetMapping
	public String getHello () {
		return "Hello World";
	}
	
	@GetMapping("/bsm")
	public String getHello2 () {
		return "A mentalidade que utilizei para esta atividade foi a de persistencia junto a habilidade de atenção aos detalhes";
	}
	@GetMapping("/perg2")
	public String getHello3 () {
		return "Os meus objetivos para esta semana é aprimorar cada vez mais a minha persistencia e atenção aos detalhes junto da responsabilidade pessoal";
	}
}
