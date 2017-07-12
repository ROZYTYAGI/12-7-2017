package threadsExamples;

import java.util.Date;

public class SumThreads extends Thread{
	private int Io,hi;
	private int[] arr;
	private int ans=0;
	public SumThreads(int Io,int hi,int[] arr)
	{
	super();
	this.Io=Io;
	this.hi=hi;
	this.arr=arr;
	
	}
	public void run()
	{
		Date dt=new Date(System.currentTimeMillis());
		System.out.println("thread start at : "+dt);
		//SumThreads[] ts=new SumThreads[4];
		for(int i=0;i<4;i++)
			ans+=arr[i];
	}
	
	public static int sum(int[] arr) throws InterruptedException {
		int len=arr.length;
		int ans=0;
		SumThreads[] ts=new SumThreads[5];
		for(int i=0;i<5;i++)
		{
			ts[i]=new SumThreads(((i+1)*len/4), (i*len)/4,arr);
			ts[i].start();
			//ts[i].start();
			//ts[i].run();
		}
		for(int i=0;i<5;i++)
		{
			ts[i].join();
			ans+=ts[i].ans;
			
			
		}
		
		
		return ans;
	}
	
	public static void main(String args[])throws InterruptedException
	{
		int[] arr=new int[100];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=1;
		}
		int sum=sum(arr);
		System.out.println("sum:"+sum);
		
	}
	

}
