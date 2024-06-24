package com.web.hooks;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

import com.github.javafaker.Faker;

public class RandomString {
	private static Faker faker =new Faker();

	public static String generateFirstName() {
		String firstName = faker.name().firstName();
		return firstName;
	}

	public static String generateLastName() {
		String lastName = faker.name().lastName();
		return lastName;
	}

	public static String getEmail() {
		String email =faker.internet().emailAddress();
		return email;
	}

	public static String randomeString()
	{
		String generatedString=RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}


	public static String randomeNumber()
	{
		String generatedString=RandomStringUtils.randomNumeric(10);
		return generatedString;
	}


	public static String randomAlphaNumeric()
	{
		String str=RandomStringUtils.randomAlphabetic(5);
		String num=RandomStringUtils.randomNumeric(10);
		return str+num;
	}
}
