package com.test;

public class Passenger
{
	public enum PassengerClass
	{
		FIRST, SECOND, THIRD
	}
	
	public enum Sex
	{
		MALE, FEMALE
	}
	
	private String name;
	private PassengerClass passengerClass;
	private Sex sex;
	private double age;
	boolean survived;
	
	public Passenger(String name, String pClass, String sex, double age, boolean survived)
	{
		this.name = name;
		if (pClass.equals("1st"))
		{
			passengerClass = PassengerClass.FIRST;
		}
		else if (pClass.equals("2nd"))
		{
			passengerClass = PassengerClass.SECOND;
		}
		else
		{
			passengerClass = PassengerClass.THIRD;
		}
		if (sex.equals("male"))
		{
			this.sex = Sex.MALE;
		}
		else
		{
			this.sex = Sex.FEMALE;
		}
		this.age = age;
		this.survived = survived;
	}
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Passenger [name=\"");
		sb.append(this.name);
		sb.append("\", survived=\"");
		sb.append(this.survived);
		sb.append("\"];");
		return sb.toString();
	}
}
