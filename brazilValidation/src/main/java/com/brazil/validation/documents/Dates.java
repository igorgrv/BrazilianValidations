package com.brazil.validation.documents;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Dates {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		//2020-04-02

		//To know more about patterns: https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(today.format(dateFormatter));
		//02/04/2020
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		//2020-04-02T11:53:41.402882600
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:MM");
		System.out.println(now.format(dateTimeFormatter));
		//02/04/2020 11:04
		
		DateTimeFormatter dateTimeFormatterLong = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		System.out.println(now.format(dateTimeFormatterLong));
		//2 de abril de 2020
	}
}
