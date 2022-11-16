package threadparctice;


class MyThread11 implements Runnable
{
	public void run()
	{
		displayEvenNumbers();
	}
	void displayEvenNumbers()
	{
		try
		{
			for(int i=20;i<=40;i++)
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
public class cas1 {

	public static void main(String[] args) {
		MyThread11 job=new MyThread11();

		Thread t1=new Thread(job);
		t1.start();
	}

}
