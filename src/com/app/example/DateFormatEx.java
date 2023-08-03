package com.app.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatEx {

	public static void main(String[] args) {
		String pattern = "MM/dd/yyyy";
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		String newDate = dateFormat.format(new Date());
		System.out.println(newDate);
	}
}
