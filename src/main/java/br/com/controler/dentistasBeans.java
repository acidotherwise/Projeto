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

import br.com.model.Pessoas;

@Named
@ViewScoped
public class dentistasBeans implements Serializable {
	private static final long serialVersionUID = 1L;

	private List<Pessoas> pessoas;	
	@Inject
	EntityManager manager;
	
	@PostConstruct
	public void consultar() {

		TypedQuery<Pessoas> query = manager.createQuery("from Pessoas", Pessoas.class);
		this.pessoas = query.getResultList();
		manager.close();
	}

	public List<Pessoas> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoas> Pessoas) {
		this.pessoas = Pessoas;
	}

	public void dialogDentistas() {
		Map<String, Object> options = new HashMap<String, Object>();
		options.put("modal", true);
		options.put("width", 600);
		options.put("height", 200);
		options.put("contentWidth", "100%");
		options.put("contentHeight", "100%");
		options.put("resizable", false);
		options.put("widgetVar ", "dlDentistasCadastro");
		RequestContext.getCurrentInstance().openDialog("DentistasCadastro", options, null);

	}

}
