package br.com.darius.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.darius.projeto.model.Convidado;
import br.com.darius.projeto.repository.ConvidadoRepository;

@Controller
public class ConvidadoController {

	@Autowired
	private ConvidadoRepository repository;

	@RequestMapping("/")
	public String index() {
		/*
		 * Vai buscar na pasta /resources/template a pagina html, tudo é por convenção
		 * Spring MVC. Para tal é necessário adiocinar uma dependência no projeto:
		 * spring-boot-starter-thymeleaf todos os nomes das pastas de configuração são
		 * convencionados.
		 */
		return "index";
	}

	@RequestMapping("listaconvidados")
	public String listarConvidados(Model model) {
		Iterable<Convidado> convidados = repository.findAll();
		model.addAttribute("convidados", convidados);
		System.out.println("Caralho");
		return "listaconvidados";
	}

	@RequestMapping(value = "salvar", method = RequestMethod.POST)
	public String salvar(@RequestParam("nome") String nome, @RequestParam("email") String email,
			@RequestParam("telefone") String telefone, Model model) {

		Convidado novoConvidado = new Convidado(nome, email, telefone);
		repository.save(novoConvidado);

		Iterable<Convidado> convidados = repository.findAll();
	    model.addAttribute("convidados", convidados);
		
		return "listaconvidados";
	}

}
