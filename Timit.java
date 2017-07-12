package threadsExamples;

public class Timit {
public static void code(Runnable r) {
	long start=System.currentTimeMillis();
	try {
		r.run();
	}catch(Exception e) {
		
	}
	start=System.currentTimeMillis()-start;
	System.out.println("Time taken " +start +" millisec");
}
}
