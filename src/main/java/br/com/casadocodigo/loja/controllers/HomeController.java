package br.com.casadocodigo.loja.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.casadocodigo.loja.daos.ProdutoDAO;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index() {
		System.out.println("Entrando na Home da casa do código!");
		return "home";
	}
}
