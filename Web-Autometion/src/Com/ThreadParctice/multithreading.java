package Com.ThreadParctice;

class MyThread1 implements Runnable
{
	public void run()
	{
		DisplayEvenNumbers();
	}
	void DisplayEvenNumbers()
	{
		try
		{
			for(int i=20;i<=40;i++)
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
public class multithreading 
{

	public static void main(String[] args) 
	{
		MyThread1 aa=new MyThread1();
		Thread aa1=new Thread(aa);
		Thread aa2=new Thread(aa);
		aa1.setName("alpha");
		aa2.setName("Rajendra");
		aa1.start();
		aa2.start();
	}

}
