package arraylistpractice;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 
{

	public static void main(String[] args) 
	{
		addelements();
		removeElements();
		readelements1();
		readelements2();
		ArrayToconvert();
	}
	private static void addelements()
	{
		HashSet<String> obj=new HashSet<String>();
		System.out.println("Elements:"+obj);
		obj.add("mango");
		obj.add("apple");
		obj.add("sugar");
		obj.add("banana");
		System.out.println("Elements:"+obj);
		HashSet<String> obj1=new HashSet<String>();
		obj1.add("white");
		obj1.add("red");
		obj1.add("blue");
		obj1.add("green");
		obj.addAll(obj1);
		System.out.println("Elements:"+obj);
	}
	private static void removeElements()
	{
		HashSet<String> obj=new HashSet<String>();
		System.out.println("Elements:"+obj);
		obj.add("mango");
		obj.add("apple");
		obj.add("sugar");
		obj.add("banana");
		System.out.println("Elements:"+obj);
		obj.remove("sugar");
		System.out.println("Elements:"+obj);
		obj.removeAll(obj);
		System.out.println("Elements:"+obj);		
	}
	private static void readelements1()
	{
		HashSet<String> obj=new HashSet<String>();
		System.out.println("Elements:"+obj);
		obj.add("mango");
		obj.add("apple");
		obj.add("sugar");
		obj.add("banana");
		System.out.println("Elements:"+obj);
		for(String str:obj)
		{
			System.out.println(str);
			
		}
		
	}
	private static void readelements2()
	{
		HashSet<String> obj=new HashSet<String>();
		System.out.println("Elements:"+obj);
		obj.add("mango");
		obj.add("apple");
		obj.add("sugar");
		obj.add("banana");
		System.out.println("Elements:"+obj);
		Iterator<String> ite=obj.iterator();
		while(ite.hasNext());
		{
			System.out.println(ite.next());
		}
	}
	private static void ArrayToconvert()
	{
		HashSet<String> obj=new HashSet<String>();
		System.out.println("Elements:"+obj);
		obj.add("mango");
		obj.add("apple");
		obj.add("sugar");
		obj.add("banana");
		System.out.println("Elements:"+obj);
		Object a[]=obj.toArray();
		for(int i=0;i<a.length;i++)
		{
			System.out.println(i);
		}
	}
	private static void withoutgeneric()
	{
		HashSet obj=new HashSet();
		obj.add("apple");
		obj.add("sugar");
		obj.add(100);
		obj.add(25.55);
		System.out.println("elements:"+obj);
	}
}










