package com.algaworks.bibliotecadigital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.algaworks.bibliotecadigital.model.Livro;
import com.algaworks.bibliotecadigital.repository.Livros;


@Controller
public class LivrosController {
	
	@Autowired
	private Livros livros;
	
	@RequestMapping("/")
	public String login(){
		return "Login";
	}
	
	@PostMapping("/")
	public String autenticacao(){
		return "redirect:/livros";
	}
	
	@GetMapping("/livros")
	public ModelAndView home(){
		ModelAndView mv = new ModelAndView("CadastroLivros");
		mv.addObject("livros",livros.findAll());		
		return mv;
	}
	
	
	@PostMapping("/livros")
	public String salvar(Livro livro){
		livros.save(livro);
		return "redirect:/livros";
	}

}
