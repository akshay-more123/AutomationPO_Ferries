package com.web.hooks;

import org.apache.commons.lang3.RandomStringUtils;

import com.github.javafaker.Faker;

import net.bytebuddy.utility.RandomString;

public class RandomData {

	private static Faker faker = new Faker();
	
	public static String generateFirstName()
	{
		String firstName = faker.name().firstName();
		return firstName;
	}
	
	
	public static String generateLasttName()
	{
		String LasttName = faker.name().lastName();
		return LasttName;
	}
	
	public static String generateEmail()
	{
		String Email = faker.internet().emailAddress();
		return Email;
	}
	
	
	public static String getAlfaNumeric()
	{
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}
	
	public static String getRandomNumber()
	{
		String number = RandomStringUtils.randomNumeric(3);
		return number;
	}
}
