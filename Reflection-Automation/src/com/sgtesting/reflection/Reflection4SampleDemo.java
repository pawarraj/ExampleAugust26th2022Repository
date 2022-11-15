package com.sgtesting.reflection;

public class Reflection4SampleDemo {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.sgtesting.reflection4.Sample");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

}
