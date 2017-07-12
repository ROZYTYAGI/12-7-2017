package threadsExamples;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Arrays;

public class StreamTest {
	public static void main(String a[])
	{
		Person person=new Person("rahul ",54,Gender.Male);
	    Person person1=new Person("rahul2 ",52,Gender.Female);
		Person person2=new Person("rahul ",51,Gender.Male);
		Person person3=new Person("rahul ",50,Gender.Male);
		List<Person> people=Arrays.asList(person,person1,person2,person3);
		/*Map<Gender,List<Person>> mapwithkey=
		people.stream()
		     .collect(
				Collectors.groupingBy(Person::getGender));
		/*Map<String,Person> map1=
				people.stream()
				     .collect(
						Collectors.toMap(
								(Person p)->p.getName(),(Person p)->p));*/
	//	mapwithkey.entrySet().forEach(System.out::println);
		//System.out.println(map);
		List<Integer> numbers=Arrays.asList(3,5,3,4,6,8,10);
		/*System.out.println(numbers.stream()
				.filter(y->y>3)
				.filter(y->y%2==2)
				.reduce(8,(y,k)->y=y+k));*/
		//List<String> numbers=Arrays.asList();
	/*	System.out.println(people.stream()
				.map((Person v)->v.getName())
				
				.reduce("",(v,k)->v.concat(k)));*/
		
		
		System.out.println(numbers.stream()
				.map(y->y%3)
				.reduce(0,(y,k)->y=y+k)	);
	
	}
}
