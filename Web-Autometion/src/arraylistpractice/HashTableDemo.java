package arraylistpractice;

import java.util.Hashtable;

public class HashTableDemo 
{

	public static void main(String[] args) 
	{
		//addElements();
		ReadandRemoveElements();

	}
	private static void addElements()
	{
		Hashtable<String,String> obj=new Hashtable<String,String>();
		System.out.println("elements:"+obj);
		obj.put("mango","mango is the king of fruits ");
		obj.put("lotus", "lotus is the national flower");
		obj.put("peacock", "peacock is the national bird");
		obj.put("banglore", "banglore is the gardencity");
		System.out.println("elemnets:"+obj);
	}
	private static void ReadandRemoveElements()
	{
		Hashtable<String,String> obj=new Hashtable<String,String>();
		System.out.println("elements:"+obj);
		obj.put("mango","mango is the king of fruits ");
		obj.put("lotus", "lotus is the national flower");
		obj.put("peacock", "peacock is the national bird");
		obj.put("banglore", "banglore is the gardencity");
		System.out.println("elemnets:"+obj);
		//readElement
		String val=obj.get("lotus");
		System.out.println(val);
		//removeElements
		obj.remove("mango");
		System.out.println("elements:"+obj);
		//read
		String val2=obj.get("peacock");
		System.out.println(val2);
		
	}
}
