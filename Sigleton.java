package threadsExamples;

public class Sigleton {
	public static Sigleton ins;
synchronized public static Sigleton getInstance()
{
		if(ins==null)
	{
		ins=new Sigleton();
			}
	return ins;
}
private Sigleton(){
}
}
