package arraylistpractice;

import java.util.HashMap;

public class HashMapDemo 
		{

			public static void main(String[] args) 
			{
				addElements();
				readRemoveElements();
				readElements();
			}
			
			private static void addElements()
			{
				HashMap<String,String> obj=new HashMap<String,String>();
				System.out.println("Elements:"+obj);
				obj.put("Lotus", "Lotus is a national flower");
				obj.put("Mango", "Mango is the king of the fruits");
				obj.put("Camel", "Camel is a ship of the desert");
				obj.put("Peacock", "Peacock is a national bird");
				obj.put("Bangalore", "Bangalore is a garden city");
				obj.put(null, "Null key supported by HashMap");
				System.out.println("Elements :"+obj);
			}
			
			private static void readRemoveElements()
			{
				HashMap<String,String> obj=new HashMap<String,String>();
				System.out.println("Elements:"+obj);
				obj.put("Lotus", "Lotus is a national flower");
				obj.put("Mango", "Mango is the king of the fruits");
				obj.put("Camel", "Camel is a ship of the desert");
				obj.put("Peacock", "Peacock is a national bird");
				obj.put("Bangalore", "Bangalore is a garden city");
				obj.put(null, "Null key supported by HashMap");
				System.out.println("Elements :"+obj);
				//read Element
				String val1=obj.get("Mango");
				System.out.println(val1);
				//Remove Element
				obj.remove("Mango");
				//Read Element
				String val2=obj.get("Mango");
				System.out.println(val2);
			}

			private static void readElements()
			{
				HashMap<String,String> obj=new HashMap<String,String>();
				System.out.println("Elements:"+obj);
				obj.put("Lotus", "Lotus is a national flower");
				obj.put("Mango", "Mango is the king of the fruits");
				obj.put("Camel", "Camel is a ship of the desert");
				obj.put("Peacock", "Peacock is a national bird");
				obj.put("Bangalore", "Bangalore is a garden city");
				obj.put(null, "Null key supported by HashMap");
				System.out.println("Elements :"+obj);
				
				obj.forEach((k,v) -> System.out.println(k +"===> "+v));
			}	
	}


