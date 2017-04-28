package com.br.bean;

import javax.faces.component.FacesComponent;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(forClass= Long.class, value = "cpfConverte")

public class CPFConverte implements Converter {

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		// TODO Auto-generated method stub
		
		String cpf = arg2;
		//System.out.println(cpf);
		
		if(arg2 != null && !arg2.equals("")){
			
			//cpf = arg2.replaceAll(".","").replaceAll("-","");
			
			cpf = cpf.replace(".","");
			
			System.out.println("cpf2"+cpf);

			return Long.valueOf(cpf);
			
		}else{
			return null;
		}
		
		
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		// TODO Auto-generated method stub
		if (arg2 != null){
			
			return "000"+arg2.toString();
		}
		return null;
	}

}
