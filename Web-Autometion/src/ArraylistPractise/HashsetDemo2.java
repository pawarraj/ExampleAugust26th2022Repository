package ArraylistPractise;

import java.util.HashSet;

class Demo
{
	static HashSet<String>findemp(String dep)
	{
		HashSet<String> emp=new HashSet<String>();
		emp.add("Rajendra");
		emp.add("pawar");
		return emp;	
	}
}

public class HashsetDemo2 
{

	public static void main(String[] args) 
	{
		HashSet<String> aa=Demo.findemp("civil");
		System.out.println(aa);

	}

}
