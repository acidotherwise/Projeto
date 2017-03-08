package br.com.controler;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import br.com.model.tipoAgendamento;
import br.com.util.Transactional;


@Named
@RequestScoped
public class agendaTipoCadastroBeans implements Serializable {
	private static final long serialVersionUID = 1L;

	private tipoAgendamento tipoAgendamento = new tipoAgendamento();
	private List<tipoAgendamento> todostipoAgendamento;
	private tipoAgendamento agendaTipoSelecionado = new tipoAgendamento();

//	EntityManager manager = jpaUtil.getEntityManager();
	@Inject
	private EntityManager manager;
	
//	public void prepararCadastro() {
//		try {
//			if (this.tipoAgendamento == null) {
//				bancosRepositorio bancosRepositorio = new bancosRepositorio(manager);
//				this.todosBancos = bancosRepositorio.todas();
//			}
//		} finally {
//			manager.close();
//		}
//	}

//	public void salvar() {
//		EntityTransaction trx = manager.getTransaction();
//		FacesContext context = FacesContext.getCurrentInstance();
//		try {
//			trx.begin();
//			bancosCadastro cadastro = new bancosCadastro(new bancosRepositorio(manager));
//			cadastro.salvar(this.bancos);
//			this.bancos = new bancos();
//			context.addMessage(null, new FacesMessage("Banco salvo com sucesso!"));
//			trx.commit();
//		} catch (NegocioException e) {
//			trx.rollback();
//			FacesMessage mensagem = new FacesMessage(e.getMessage());
//			mensagem.setSeverity(FacesMessage.SEVERITY_ERROR);
//			context.addMessage(null, mensagem);
//		} finally {
//			manager.close();
//		}
//	}

	@Transactional
	public void excluir() {
		FacesContext context = FacesContext.getCurrentInstance();
		try {
			tipoAgendamento = manager.find(tipoAgendamento.class, this.agendaTipoSelecionado.getId());
			this.manager.remove(tipoAgendamento);
		} catch (Exception e) {
		} finally {
			this.manager.flush();
			context.addMessage(null, new FacesMessage("Tipo de Agenda excluído com sucesso!"));
		}

	}

	public List<tipoAgendamento> getTodostipoAgendamento() {
		return this.todostipoAgendamento;
	}

	public tipoAgendamento getTipoAgendamento() {
		return tipoAgendamento;
	}

	public void setTipoAgendamento(tipoAgendamento tipoAgendamento) {
		this.tipoAgendamento = tipoAgendamento;
	}

	public void setTipoAgendamentoSelecionado(tipoAgendamento agendaTipoSelecionado) {
		this.agendaTipoSelecionado = agendaTipoSelecionado;
	}

	public tipoAgendamento getTipoAgendamentoSelecionado() {
		return agendaTipoSelecionado;
	}

}
