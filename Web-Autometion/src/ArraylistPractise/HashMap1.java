package ArraylistPractise;

import java.util.HashMap;

public class HashMap1 
{

	public static void main(String[] args) 
	{
		addElements();
		readremoveElements();
		readelements();

	}
	private static void addElements()
	{
		HashMap<String,String> obj=new HashMap<String,String>();
		System.out.println("Elements:"+obj);
		obj.put("lotus", "lotus is a national flower");
		obj.put("mango", "mango is the king of the fruits");
		obj.put("camel", "camel is the ship of the desert");
		obj.put("peacock", "peacock is the national bird");
		obj.put("banglore", "banglore is the garden city");
		obj.put(null, "null key supported by hash map");
		System.out.println("elements:"+obj);
	}
	private static void readremoveElements()
	{
		HashMap<String,String> obj=new HashMap<String,String>();
		System.out.println("Elements:"+obj);
		obj.put("lotus", "lotus is a national flower");
		obj.put("mango", "mango is the king of the fruits");
		obj.put("camel", "camel is the ship of the desert");
		obj.put("peacock", "peacock is the national bird");
		obj.put("banglore", "banglore is the garden city");
		obj.put(null, "null key supported by hash map");
		System.out.println("elements:"+obj);
		//read elements
		String val1=obj.get("Mango");
		System.out.println(val1);
		obj.remove(val1);
	}
	private static void readelements()
	{
		HashMap<String,String> obj=new HashMap<String,String>();
		System.out.println("elements:"+obj);
		obj.put("lotus", "lotus is a national flower");
		obj.put("mango", "mango is the king of the fruits");
		obj.put("camel", "camel is the ship of the desert");
		obj.put("peacock", "peacock is the national bird");
		obj.put("banglore", "banglore is the garden city");
		obj.put(null, "null key supported by hash map");
		System.out.println("elements:"+obj);
		
		obj.forEach((k,v) -> System.out.println(k +"===> "+v));
		
	}

}





