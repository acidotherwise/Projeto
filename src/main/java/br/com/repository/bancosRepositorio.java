
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.repository;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.model.bancos;


/**
 *
 * @author Rodrigo
 */

public class bancosRepositorio implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;

	public bancosRepositorio(EntityManager manager) {
		this.manager = manager;
	}

	public bancos porId(Long id) {
		return manager.find(bancos.class, id);
	}

	public List<bancos> todas() {
		TypedQuery<bancos> query = manager.createQuery("from bancos", bancos.class);
		return query.getResultList();
	}

	public void adicionar(bancos bancos) {
		this.manager.persist(bancos);
	}

	public bancos guardar(bancos bancos) {
		return this.manager.merge(bancos);
	}

	public void remover(bancos bancos) {
			this.manager.remove(bancos);
			this.manager.flush();
		
	}

}
