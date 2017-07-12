package threadsExamples;

public class Person {
String name;
private Gender gender;
private int age;
public Person(String name,int age, Gender gender)
{
	this.name=name;
	this.age=age;
	this.gender=gender;
}

public String getGender() {
	return gender.toString();
}
public void setGender(Gender gender) {
	this.gender = gender;
}


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int hashCode()
{
	//final int prime=32;
	//int result=1;
	//age.result=prime*result + age;
	//result=prime*result + ((name==null) ? 0 : name.hashCode());
	//return result;
	return 7;
}
public boolean equals(Object obj)
{
	if(this==obj) 
		return true;
	if(this==null)
		return false;
	if(getClass() !=obj.getClass())
		return false;
	Person other=(Person)obj;
	if(age!=other.age)
		return false;
	if(name==null)
	{
		if(other.name!=null)
			return false;
	}
	else if(!name.equals(other.name))
		return false;
	return true;
	}
@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + "]";
}
}


