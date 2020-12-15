package br.com.caelum.tarefas.controller;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.caelum.tarefas.dao.TarefaDAO;
import br.com.caelum.tarefas.modelo.Tarefa;

@Controller
public class TarefasController {

	private final TarefaDAO tarefaDAO;

	@Autowired
	public TarefasController(TarefaDAO tarefaDAO) {
		this.tarefaDAO = tarefaDAO;
	}

	@RequestMapping("novaTarefa")
	public String form() {
		return "tarefa/formulario";
	}

	@RequestMapping("adicionaTarefa")
	public String adiciona(@Valid Tarefa tarefa, BindingResult result) {

		// se existir erro na validação no atributo decricao volta para pagina
		// formulario
		if (result.hasFieldErrors("descricao")) {
			return "tarefa/formulario";
		}

		// se existir erro mais generico volta para pagina formulario
//		if (result.hasErrors()) {
//			return "tarefa/formulario";
//		}

		tarefaDAO.adiciona(tarefa);
		return "tarefa/adicionada";
	}

	@RequestMapping("listaTarefas")
	public String lista(Model model) {
		// List<Tarefa> tarefas = tarefaDAO.lista();
		model.addAttribute("tarefas", tarefaDAO.lista());
		return "tarefa/lista";
	}

	@RequestMapping("removeTarefa")
	public String remove(Tarefa tarefa) {
		tarefaDAO.remove(tarefa);
		return "redirect:listaTarefas";
	}

	@RequestMapping("mostraTarefa")
	public String mostra(Long id, Model model) {
		model.addAttribute("tarefa", tarefaDAO.buscaPorId(id));
		return "tarefa/mostra";
	}

	@RequestMapping("alteraTarefa")
	public String altera(Tarefa tarefa) {
		tarefaDAO.altera(tarefa);
		return "redirect:listaTarefas";
	}

	// @ResponseBody
	@RequestMapping("finalizaTarefa")
	public void finaliza(Long id, HttpServletResponse response) {
		tarefaDAO.finaliza(id);
		response.setStatus(200);
	}

}