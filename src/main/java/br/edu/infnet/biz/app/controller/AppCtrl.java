package br.edu.infnet.biz.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.edu.infnet.biz.app.modelo.Aluno;

@Controller
public class AppCtrl {

	
	@Autowired
	private AlunoService alunoService;

	@RequestMapping(value="/",  method=RequestMethod.GET)
	public String getHello(Model model) {
		model.addAttribute("msg", "Hello");
		alunoService.getAll();
		return "welcome";
	}
	
	
	@RequestMapping(value="/save",  method=RequestMethod.POST)
	public String save(Aluno aluno, Model model) {
		alunoService.salvar(aluno);
		model.addAttribute("lista", alunoService.getAll());
		return "welcome";
	}

	public AlunoService getAlunoService() {
		return alunoService;
	}

	public void setAlunoService(AlunoService alunoService) {
		this.alunoService = alunoService;
	}
	
}
