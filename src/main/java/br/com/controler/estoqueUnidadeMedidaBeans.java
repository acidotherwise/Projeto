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

import br.com.model.estoqueUnidadeMedida;

@Named
@ViewScoped
public class estoqueUnidadeMedidaBeans implements Serializable {
	private static final long serialVersionUID = 1L;

	private List<estoqueUnidadeMedida> estoqueUnidadeMedida;
	@Inject
	EntityManager manager;
	
	@PostConstruct
	public void consultar() {

		TypedQuery<estoqueUnidadeMedida> query = manager.createQuery("from estoqueUnidadeMedida", estoqueUnidadeMedida.class);
		this.estoqueUnidadeMedida = query.getResultList();
		manager.close();
	}

	public List<estoqueUnidadeMedida> getEstoqueUnidadeMedida() {
		return estoqueUnidadeMedida;
	}

	public void setEstoqueUnidadeMedida(List<estoqueUnidadeMedida> estoqueUnidadeMedida) {
		this.estoqueUnidadeMedida = estoqueUnidadeMedida;
	}

	public void dialogEstoqueUnidadeMedida() {
		Map<String, Object> options = new HashMap<String, Object>();
		options.put("modal", true);
		options.put("width", 600);
		options.put("height", 200);
		options.put("contentWidth", "100%");
		options.put("contentHeight", "100%");
		options.put("resizable", false);
		options.put("widgetVar ", "dlEstoqueUnidadeMedidaCadastro");
		RequestContext.getCurrentInstance().openDialog("estoqueUnidadeMedidaCadastro", options, null);

	}

}
