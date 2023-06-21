class A implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("rachit");
			try {
			Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
public class runnabless {

	public static void main(String[] args) {
		A obj = new A();
		Thread t = new Thread(obj);
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Singhal");
			try {
				Thread.sleep(1000);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
		}
	}

}
