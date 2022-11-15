package com.sgtesting.reflection;

import java.lang.reflect.Method;

public class Reflection3SampleDemo {

	public static void main(String[] args) {
		try
		{
			Reflection3Sample obj=new Reflection3Sample();
			Method[] method=obj.getClass().getDeclaredMethods();
			
			for(int i=0;i<method.length;i++)
			{
				method[i].invoke(obj);
			}
		}catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

}
