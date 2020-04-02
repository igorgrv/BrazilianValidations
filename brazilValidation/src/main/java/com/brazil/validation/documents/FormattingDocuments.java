package com.brazil.validation.documents;

import br.com.caelum.stella.format.CNPJFormatter;
import br.com.caelum.stella.format.CPFFormatter;
import br.com.caelum.stella.format.Formatter;

public class FormattingDocuments {

	public static void main(String[] args) {
		String CPF = "798.866.380-10";
		String CNPJ = "82.118.073/0001-47";
		
		String CPFUnformatted = documentsFormatter(new CPFFormatter(), CPF);
		System.out.println(CPFUnformatted);
		
		String CNPJUnformatted = documentsFormatter(new CNPJFormatter(), CNPJ);
		System.out.println(CNPJUnformatted);

	}
	
	public static String documentsFormatter(Formatter formatter, String document) {
		return formatter.unformat(document);
	}
}
