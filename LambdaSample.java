package threadsExamples;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.Arrays;
import java.util.ArrayList;

public class LambdaSample {
	public static void main(String args[])
	{
		//Thread t=new Thread(()->System.out.println("Inside Thread"));
	//	t.start();
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7);
		Timit.code(()->System.out.println(list.stream()
		.filter(LambdaSample::GT3)
		.filter(LambdaSample::isPrime)
		.mapToDouble(LambdaSample::compute)
		//.mapToInt(value->value)
		.sum()));
		
		//.forEach(System.out::println);
		
		/*list.stream()
		.map(String::valueOf)
		.forEach(System.out::println);*/
		//list.forEach(LambdaSample::printWithHello);
		/*Timit.code(()->{
			list.forEach(LambdaSample::printWithHello);
		}
		);*/
		/*Thread t=new Thread(new Runnable()
				{
			@Override
			public void run()
			{
				//for(int i=0;i<list.size();i++)
				for(Integer i:list){
				System.out.println(list);	
				}
			}
		}		
				
	);
t.start();	*/
		/*list.forEach(new Consumer<Integer>()
				{
			

			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
			System.out.println(t);	
			}
				});
		list.forEach((Integer t)->System.out.println(t));*/
		//list.forEach(System.out::println);//method reference
		//list.forEach(e->System.out.println(e));
		//list.forEach(String::valueOf);
		
}
	private static boolean GT3(int value) {
	// TODO Auto-generated method stub
	return value>3;
}
private static boolean isPrime(int value) {
	// TODO Auto-generated method stub
	return value%2==0;
}
private static double compute(int value) {
	// TODO Auto-generated method stub
	return value*2;
}


public static void printWithHello(int a) 
{
	try {
		Thread.sleep(200);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Hello " + a);
}
}

