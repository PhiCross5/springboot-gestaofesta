package com.algaworks.festa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//web.bind.annotation para anotações de pedidos HTTP e mais.
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.servlet.ModelAndView;

import com.algaworks.festa.repository.Convidados;
import com.algaworks.festa.model.Convidado;

@Controller
@RequestMapping("/convidados")
public class ConvidadosController {
	@Autowired
	private Convidados convidados;
	
	
	//mapear pedido '/convidados' para conteúdo da página 'ListaConvidados.html'
    @GetMapping
    public ModelAndView listar() {
    	ModelAndView modelAndView=new ModelAndView("ListaConvidados");
    	modelAndView.addObject("convidados", convidados.findAll());
    	modelAndView.addObject(new Convidado());
    	return modelAndView;
    }
    
    @PostMapping
    public String salvar(Convidado convidado){
    	this.convidados.save(convidado);
    	return "redirect:/convidados";
    }
    
}