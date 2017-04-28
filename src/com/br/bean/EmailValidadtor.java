package com.br.bean;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator(value="emailValidator")
public class EmailValidadtor implements Validator{

	@Override
	public void validate(FacesContext arg0, UIComponent arg1, Object value) throws ValidatorException {
		// TODO Auto-generated method stub
		String email = value.toString();
		
		boolean isValido = email.contains("@");
		//se o email inválido, lança exceção referente a valiaçao.
		
		if(!isValido){
			FacesMessage f = new FacesMessage("Erro no email");
			
			f.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(f);
		}
		
	}

}
