/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controler;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.model.bancos;

import br.com.repository.bancosRepositorio;
import br.com.util.Transactional;

/**
 *
 * @author Rodrigo
 */
@Named
@ViewScoped
public class bancosCadastroBeans implements Serializable {
	private static final long serialVersionUID = 1L;

	private bancos bancos = new bancos();
	private List<bancos> todosBancos;
	private bancos bancosSelecionado = new bancos();

	 @Inject
	 private EntityManager manager;

	public void prepararCadastro() {
		try {
			if (this.bancos == null) {
				bancosRepositorio bancosRepositorio = new bancosRepositorio(manager);
				this.todosBancos = bancosRepositorio.todas();
			}
		} finally {
			//manager.close();
		}
	}
	
	
	@PostConstruct
	public  void consultar() {
		TypedQuery<bancos> query = manager.createQuery("from bancos", bancos.class);
		this.todosBancos = query.getResultList();
		//manager.close();
	}

	public List<bancos> getTodosBancos() {
		return todosBancos;
	}

	public void setTodosBancos(List<bancos> bancos) {
		this.todosBancos = bancos;
	}



	@Transactional
	public void excluir() {
		FacesContext context = FacesContext.getCurrentInstance();
		try {
			bancos = manager.find(bancos.class, this.bancosSelecionado.getId());
			this.manager.remove(bancos);
			todosBancos.remove(this.bancosSelecionado);
		} catch (Exception e) {
		} finally {
			this.manager.flush();
			context.addMessage(null, new FacesMessage("Banco excluído com sucesso!"));			
		}

	}


	public bancos getBancos() {
		return bancos;
	}

	public void setBancos(bancos bancos) {
		this.bancos = bancos;
	}

	public void setBancosSelecionado(bancos bancosSelecionado) {
		this.bancosSelecionado = bancosSelecionado;
	}

	public bancos getBancosSelecionado() {
		return bancosSelecionado;
	}

}
