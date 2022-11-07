package Com.ThreadParctice;

class MyThread6 implements Runnable 
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
					Thread.sleep(1000);

					System.out.println(Thread.currentThread().getName()+"DisplayEvenNumbers:"+i);
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
public class MultiThreading2 
{

	public static void main(String[] args) 
	{
		MyThread6 job= new MyThread6();
		Thread t=new Thread(job);
		Thread tt=new Thread(job);
		t.setName("Rajendra");
		tt.setName("pawar");
		t.start();
		tt.start();
	}
}
