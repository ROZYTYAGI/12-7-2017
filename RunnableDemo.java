package threadsExamples;

public class RunnableDemo implements Runnable
{
	private Thread t;
	private String threadName;
	
 RunnableDemo(String threadName)
	{
	super();
	this.threadName=threadName;
	System.out.println("create Thread"+ threadName);
}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Runnable"+ threadName);
		for(int i=4;i>0;i--)
		{
			System.out.println("Thread"+ threadName +"," +i);
			
			try {
				
				Thread.sleep(50);;
			
			}catch(InterruptedException e)
			{
				System.out.println("Thread Intrrupted");
			}}}
				public void start()
				{
				System.out.println("Starting"+threadName);	
				if(t==null)
				{
				t=new Thread(this, threadName);
				t.start();
				}
				}
			
		
		
		
	}


