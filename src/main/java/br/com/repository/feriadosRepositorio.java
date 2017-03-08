package br.com.repository;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.model.feriados;

public class feriadosRepositorio implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;

	public feriadosRepositorio(EntityManager manager) {
		this.manager = manager;
	}

	public feriados porId(Long id) {
		return manager.find(feriados.class, id);
	}

	public List<feriados> todas() {
		TypedQuery<feriados> query = manager.createQuery("from feriados", feriados.class);
		return query.getResultList();
	}

	public void adicionar(feriados feriados) {
		this.manager.persist(feriados);
	}

	public feriados guardar(feriados feriados) {
		return this.manager.merge(feriados);
	}

	public void remover(feriados feriados) {
			this.manager.remove(feriados);
			this.manager.flush();
		
	}

}
