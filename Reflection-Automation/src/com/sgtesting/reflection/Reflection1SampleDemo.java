package com.sgtesting.reflection;
import java.lang.reflect.Method;
public class Reflection1SampleDemo {
	public static void main(String[] args) {
		try
		{
			Reflection1Sample obj=new Reflection1Sample();
			Method method[]=obj.getClass().getMethods();
			
			for(int i=0;i<method.length;i++)
			{
				String methodname=method[i].getName();
				System.out.println(methodname);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
