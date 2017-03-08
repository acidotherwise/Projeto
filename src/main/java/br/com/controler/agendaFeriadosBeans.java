package br.com.controler;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.primefaces.context.RequestContext;

import br.com.model.feriados;
import br.com.repository.feriadosRepositorio;
import br.com.util.Transactional;


@Named
@ViewScoped
public class agendaFeriadosBeans implements Serializable {
	private static final long serialVersionUID = 1L;

	private List<feriados> listFeriados;
	private feriados feriados = new feriados();
	private feriados feriadosSelecionado = new feriados();

	@Inject
	private EntityManager manager;

	public void prepararCadastro() {
		try {
			if (this.feriados == null) {
				feriadosRepositorio feriadosRepositorio = new feriadosRepositorio(manager);
				this.listFeriados = feriadosRepositorio.todas();
			}
		} finally {
			manager.close();
		}
	}

	@PostConstruct
	public void consultar() {
		TypedQuery<feriados> query = manager.createQuery("from feriados", feriados.class);
		this.listFeriados = query.getResultList();
		manager.close();
	}


	public List<feriados> getListFeriados() {
		return listFeriados;
	}

	public void setListFeriados(List<feriados> feriados) {
		this.listFeriados = feriados;
	}

	public void dialogFeriados() {
		Map<String, Object> options = new HashMap<String, Object>();
		options.put("modal", true);
		options.put("width", 600);
		options.put("height", 200);
		options.put("contentWidth", "100%");
		options.put("contentHeight", "100%");
		options.put("resizable", false);
		options.put("widgetVar ", "dlFeriadosCadastro");
		RequestContext.getCurrentInstance().openDialog("feriadosCadastro", options, null);

	}

	// public void salvar() {
	// EntityTransaction trx = manager.getTransaction();
	// FacesContext context = FacesContext.getCurrentInstance();
	// try {
	// trx.begin();
	// bancosCadastro cadastro = new bancosCadastro(new
	// bancosRepositorio(manager));
	// cadastro.salvar(this.bancos);
	// this.bancos = new bancos();
	// context.addMessage(null, new FacesMessage("Banco salvo com sucesso!"));
	// trx.commit();
	// } catch (NegocioException e) {
	// trx.rollback();
	// FacesMessage mensagem = new FacesMessage(e.getMessage());
	// mensagem.setSeverity(FacesMessage.SEVERITY_ERROR);
	// context.addMessage(null, mensagem);
	// } finally {
	// manager.close();
	// }
	// }

	@Transactional
	public void excluir() {
		FacesContext context = FacesContext.getCurrentInstance();
		try {
			feriados = manager.find(feriados.class, this.feriadosSelecionado);
			this.manager.remove(feriados);
		} catch (Exception e) {
		} finally {
			context.addMessage(null, new FacesMessage("feriados excluído com sucesso!"));
		}

	}


	public feriados getFeriados() {
		return feriados;
	}

	public void setFeriados(feriados feriados) {
		this.feriados = feriados;
	}

	public void setFeriadosSelecionado(feriados feriadosSelecionado) {
		this.feriadosSelecionado = feriadosSelecionado;
	}

	public feriados getFeriadosSelecionado() {
		return feriadosSelecionado;
	}

}
