package br.com.controler;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.primefaces.context.RequestContext;

import br.com.model.Convenios;


@Named
@ConversationScoped
public class conveniosBeans implements Serializable {
	private static final long serialVersionUID = 1L;

	private List<Convenios> convenios;	
	@Inject
	EntityManager manager;
	
	@PostConstruct
	public void consultar() {
		TypedQuery<Convenios> query = manager.createQuery("from Convenios", Convenios.class);
		this.convenios = query.getResultList();
		manager.close();
	}

	public List<Convenios> getConvenios() {
		return convenios;
	}

	public void setBancos(List<Convenios> Convenios) {
		this.convenios = Convenios;
	}

	public void dialogConvenios() {
		Map<String, Object> options = new HashMap<String, Object>();
		options.put("modal", true);
		options.put("width", 600);
		options.put("height", 200);
		options.put("contentWidth", "100%");
		options.put("contentHeight", "100%");
		options.put("resizable", false);
		options.put("widgetVar ", "dlBancosCadastro");
		RequestContext.getCurrentInstance().openDialog("conveniosCadastro", options, null);

	}

}
