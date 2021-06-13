package com.algaworks.festa.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class ConvidadosController {

	//mapear pedido '/convidados' para conteúdo da página 'ListaConvidados.html'
    @GetMapping("/convidados")
    String stuff() {
    	return "ListaConvidados";
    }

}