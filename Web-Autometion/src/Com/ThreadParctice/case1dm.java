package Com.ThreadParctice;

class MyThread5 implements Runnable
{
	public void run()
	{
		DisplayEvenNumbers();
	}
	void DisplayEvenNumbers()
	{
		try
		{
			for(int i=10;i<=20;i++)
			{
				if(i%2==0)
				{
					System.out.println("EvenNumbers:"+i);
				}
			}	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
public class case1dm {

	public static void main(String[] args) {
		MyThread5 RR=new MyThread5();
		Thread t3=new Thread(RR);
		t3.start();
	}

}
