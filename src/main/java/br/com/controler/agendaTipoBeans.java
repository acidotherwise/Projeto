package br.com.controler;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.primefaces.context.RequestContext;

import br.com.model.tipoAgendamento;


@Named
@ViewScoped
public class agendaTipoBeans implements Serializable {
	private static final long serialVersionUID = 1L;

	private List<tipoAgendamento> tipoAgendamento;
	@Inject
	EntityManager manager;

	@PostConstruct
	public void consultar() {
		
		TypedQuery<tipoAgendamento> query = manager.createQuery("from tipoAgendamento", tipoAgendamento.class);
		this.tipoAgendamento = query.getResultList();
		manager.close();
	}

	public List<tipoAgendamento> getTipoAgendamento() {
		return tipoAgendamento;
	}

	public void setTipoAgendamento(List<tipoAgendamento> tipoAgendamento) {
		this.tipoAgendamento = tipoAgendamento;
	}

	public void dialogTipoAgendamento() {
		Map<String, Object> options = new HashMap<String, Object>();
		options.put("modal", true);
		options.put("width", 600);
		options.put("height", 200);
		options.put("contentWidth", "100%");
		options.put("contentHeight", "100%");
		options.put("resizable", false);
		options.put("widgetVar ", "dlTipoAgendamentoCadastro");
		RequestContext.getCurrentInstance().openDialog("tipoAgendamentoCadastro", options, null);

	}

}
