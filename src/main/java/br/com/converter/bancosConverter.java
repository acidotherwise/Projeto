
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.converter;

import br.com.model.bancos;
import br.com.repository.bancosRepositorio;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;



@FacesConverter(forClass = bancos.class)
public class bancosConverter implements Converter {

	private bancosRepositorio bancosRepositorio;

	@Override
	public Object getAsObject(FacesContext context, UIComponent comp, String value) {
		bancos retorno = null;
		if (value == null || value.isEmpty()) {
			return null;
		}
		Long id = Long.parseLong(value);
		retorno = bancosRepositorio.porId(id);

		return retorno;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if (value != null) {
			bancos bancos = ((bancos) value);
			return bancos.getId() == null ? null : bancos.getId().toString();
		}
		return "";
	}

}