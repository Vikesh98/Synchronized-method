
class Synco
{
	synchronized public void show(String msg)
	{
		System.out.print(msg);
		try
		{
			Thread.sleep(500);
		}
		catch(Exception e)
		{
		}
		System.out.println();
		
	}
}

class Synco1 extends Thread
{
String msg;
Synco obj;

Synco1(Synco fp,String str)
{
obj=fp;
msg=str;
start();
}
public void run()
{
	obj.show(msg);
}
}

public class Synchronize {

	public static void main(String[] args) 
	{
		Synco obj=new Synco();
		Synco1 obj1=new Synco1(obj,"Hi");
		Synco1 obj2=new Synco1(obj,"java");
		

	}

}
