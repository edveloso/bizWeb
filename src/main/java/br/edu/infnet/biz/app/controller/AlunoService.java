package br.edu.infnet.biz.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.edu.infnet.biz.app.modelo.Aluno;
import br.edu.infnet.biz.app.persistencia.AlunoDao;

@Service
public class AlunoService {


	@Autowired
	private AlunoDao alunoDao;

	@Transactional
	public void salvar(Aluno aluno) {
		alunoDao.salvar(aluno);
	}
	
	public List<Aluno> getAll() {
		return alunoDao.getAll();
	}

	public AlunoDao getAlunoDao() {
		return alunoDao;
	}

	public void setAlunoDao(AlunoDao alunoDao) {
		this.alunoDao = alunoDao;
	}
	
	
	
}
