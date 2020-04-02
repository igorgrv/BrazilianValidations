package com.brazil.validation.documents;

import br.com.caelum.stella.validation.CNPJValidator;
import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;
import br.com.caelum.stella.validation.Validator;

public class DocumentsValidation {

	public static void main(String[] args) {
		String validCPF = "84692427094";
		String validCPF2 = "798.866.380-10"; //even with accents, it still works!
		String invalidCPF = "1111111111";
		
		try {
			documentsValidator(new CPFValidator(), validCPF);
			System.out.println("The CPF " +validCPF+" is VALID");
		} catch (InvalidStateException e) {
			System.out.println("The CPF " +validCPF+" is INVALID: " + e);
		}
		
		try {
			documentsValidator(new CPFValidator(), validCPF2);
			System.out.println("The CPF " +validCPF2+" is VALID");
		} catch (InvalidStateException e) {
			System.out.println("The CPF " +validCPF2+" is INVALID: " + e);
		}
		
		try {
			documentsValidator(new CPFValidator(), invalidCPF);
			System.out.println("The CPF " +invalidCPF+" is VALID");
		} catch (InvalidStateException e) {
			System.out.println("The CPF " +invalidCPF+" is INVALID: " + e);
		}
		
		//-------------------------------------------------------------------------------------
		String validCNPJ = "82.118.073/0001-47";
		String invalidCNPJ = "11.111.111/1111-11";
		
		try {
			documentsValidator(new CNPJValidator(), validCNPJ);
			System.out.println("The CNPJ "+validCNPJ+" is VALID");
		} catch (InvalidStateException e) {
			System.out.println("The CNPJ "+validCNPJ+" is INVALID: " + e);
		}
		
		try {
			documentsValidator(new CNPJValidator(), invalidCNPJ);
			System.out.println("The CNPJ "+invalidCNPJ+" is VALID");
		} catch (InvalidStateException e) {
			System.out.println("The CNPJ "+invalidCNPJ+" is INVALID: " + e);
		}
	}
	
	public static void documentsValidator(Validator<String> validator, String document) {
		validator.assertValid(document);
	}

}
