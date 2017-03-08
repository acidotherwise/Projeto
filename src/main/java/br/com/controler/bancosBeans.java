/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controler;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.primefaces.context.RequestContext;


/**
 *
 * @author Rodrigo
 */

@Named
@ViewScoped
public class bancosBeans implements Serializable {
	private static final long serialVersionUID = 1L;

	public void dialogBancos() {
		Map<String, Object> options = new HashMap<String, Object>();
		options.put("modal", true);
		options.put("width", 600);
		options.put("height", 200);
		options.put("contentWidth", "100%");
		options.put("contentHeight", "100%");
		options.put("resizable", false);
		options.put("widgetVar ", "dlBancosCadastro");
		RequestContext.getCurrentInstance().openDialog("bancosCadastro", options, null);

	}

}
