package threadsExamples;

public class TestThread {
	public static void main(String a[])
	{
		RunnableDemo r1=new RunnableDemo("Thred 1");
		r1.start();
		RunnableDemo r2=new RunnableDemo("Thred 2");
		r2.start();
	}

}
