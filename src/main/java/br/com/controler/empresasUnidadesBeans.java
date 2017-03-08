package br.com.controler;

import br.com.model.empresasUnidades;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;
import java.io.Serializable;



@ManagedBean(name = "empresasUnidadesBeans")
@ViewScoped
public class empresasUnidadesBeans implements Serializable {
	private static final long serialVersionUID = 1L;
	private List<empresasUnidades> empresasUnidades;
	@Inject
	EntityManager manager;

	@PostConstruct
	public void consultar() {

		TypedQuery<empresasUnidades> query = manager.createQuery("from empresasUnidades", empresasUnidades.class);
		this.empresasUnidades = query.getResultList();
		manager.close();
	}

	public List<empresasUnidades> getEmpresasUnidades() {
		return empresasUnidades;
	}

	public void setEmpresasUnidades(List<empresasUnidades> empresasUnidades) {
		this.empresasUnidades = empresasUnidades;
	}

//	public void dialogBancos() {
//		Map<String, Object> options = new HashMap<String, Object>();
//		options.put("modal", true);
//		options.put("width", 600);
//		options.put("height", 250);
//		options.put("contentWidth", "100%");
//		options.put("contentHeight", "100%");
//		options.put("resizable", false);
//		options.put("widgetVar ", "dlBancosCadastro");
//		RequestContext.getCurrentInstance().openDialog("bancosCadastro", options, null);
//
//	}

}
