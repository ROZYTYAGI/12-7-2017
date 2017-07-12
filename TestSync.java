package threadsExamples;

class Table {
	synchronized void printTable(int n)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(n*i);
			
		}
		try {
			
		
			Thread.sleep(200);
			
		}
catch(Exception e)
		{
	System.out.println(e);
		}
	}
	 void displayTable(int n)
	{
		for(int i=1;i<=3;i++)
		{
			System.out.println(n*i);
			
		}
		try {
			
		
			Thread.sleep(200);
			
		}
catch(Exception e)
		{
	System.out.println(e);
		}
}

public void print()
{
synchronized(this)	
{
	
}
}
}
class MyThread1 extends Thread
{
	Table t;
	MyThread1(Table t)
	{
		t.printTable(40);
		t.displayTable(40);
	}
}
class MyThread2 extends Thread
{
	Table t;
	MyThread2(Table t)
	{
		t.printTable(100);
		t.displayTable(100);
	}
}
	class TestSync
	{
		public static void main(String args[])
		{
			Table obj=new Table();
		MyThread1 obj2=new MyThread1(obj);
		MyThread2 obj3=new MyThread2(obj);
		obj2.start();
		obj3.start();
		
		}
	}


	

