package com.sgtesting.reflection;

import java.lang.reflect.Method;

public class Reflection2SampleDemo {

	public static void main(String[] args) {
		try
		{
			Reflection2Sample obj=new Reflection2Sample();
			Method method[]=obj.getClass().getMethods();
			
			for(int i=0;i<method.length;i++)
			{
				String methodname=method[i].getName();
				if(methodname.startsWith("display"))
				{
					method[i].invoke(obj);
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
