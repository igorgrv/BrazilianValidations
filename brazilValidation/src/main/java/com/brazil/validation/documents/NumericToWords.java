package com.brazil.validation.documents;

import java.math.BigDecimal;

import br.com.caelum.stella.inwords.FormatoDeReal;
import br.com.caelum.stella.inwords.InteiroSemFormato;
import br.com.caelum.stella.inwords.NumericToWordsConverter;

public class NumericToWords {

	public static void main(String[] args) {
		//InteiroSemFormato -> That means a number in full in Portuguese
		//FormatoDeReal -> That means a number in full in Portuguese, on Brazilian monetary
		NumericToWordsConverter converter = new NumericToWordsConverter(new InteiroSemFormato());
		NumericToWordsConverter converterMonetary = new NumericToWordsConverter(new FormatoDeReal());
		
		BigDecimal value = new BigDecimal("10.50");
		
		String numberInFull = converter.toWords(value.doubleValue());
		String numberInFullMonetary = converterMonetary.toWords(value.doubleValue());
		
		System.out.println(numberInFull);
		System.out.println(numberInFullMonetary);
		//dez reais e cinquenta centavos
	}
}
