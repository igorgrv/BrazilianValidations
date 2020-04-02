package com.brazil.validation.documents;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.convert.CurrencyConversion;
import javax.money.convert.ExchangeRateProvider;
import javax.money.convert.MonetaryConversions;

import org.javamoney.moneta.FastMoney;
import org.javamoney.moneta.convert.ExchangeRateType;

public class Money {

	public static void main(String[] args) {
		//The exercise aims to convert the Real currency to Dollar and then add to the value, simulating a tax.
		CurrencyUnit dollar = Monetary.getCurrency("USD");
		CurrencyUnit real = Monetary.getCurrency("BRL");
		MonetaryAmount productValueDollars = FastMoney.of(90, dollar);
		MonetaryAmount taxValueReal = FastMoney.of(30, real);

		//provider takes the current currency quote
		ExchangeRateProvider provider = MonetaryConversions.getExchangeRateProvider(ExchangeRateType.ECB);
		CurrencyConversion currentCurrency = provider.getCurrencyConversion(dollar);

		//apply will transform the tax amount into dollars
		MonetaryAmount taxValueDollar = currentCurrency.apply(taxValueReal);
		System.out.println(taxValueDollar); //30 reais = 5.73780 dollars

		//add will sum the taxValueDollar and the value of the product in dollars
		MonetaryAmount finalValueProductDollar = productValueDollars.add(taxValueDollar);
		System.out.println(finalValueProductDollar); // USD 95.73780
	}
}
