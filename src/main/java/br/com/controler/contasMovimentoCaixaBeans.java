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

import br.com.model.contasMovimentoCaixa;


@Named
@ViewScoped
public class contasMovimentoCaixaBeans implements Serializable {
	private static final long serialVersionUID = 1L;

	private List<contasMovimentoCaixa> contasMovimentoCaixa;
	@Inject
	EntityManager manager;
	
	

	@PostConstruct
	public void consultar() {
		TypedQuery<contasMovimentoCaixa> query = manager.createQuery("from contasMovimentoCaixa", contasMovimentoCaixa.class);
		this.contasMovimentoCaixa = query.getResultList();
		manager.close();
	}

	public List<contasMovimentoCaixa> getContasMovimentoCaixa() {
		return contasMovimentoCaixa;
	}

	public void setContasMovimentoCaixa(List<contasMovimentoCaixa> contasMovimentoCaixa) {
		this.contasMovimentoCaixa = contasMovimentoCaixa;
	}

	public void dialogContasMovimentoCaixa() {
		Map<String, Object> options = new HashMap<String, Object>();
		options.put("modal", true);
		options.put("width", 600);
		options.put("height", 200);
		options.put("contentWidth", "100%");
		options.put("contentHeight", "100%");
		options.put("resizable", false);
		options.put("widgetVar ", "dlcontasMovimentoCaixaCadastro");
		RequestContext.getCurrentInstance().openDialog("contasMovimentoCaixaCadastro", options, null);

	}

}
