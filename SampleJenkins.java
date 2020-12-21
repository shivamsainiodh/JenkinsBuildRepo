public class SampleJenkins
{
public static void main(String[] args)
{
	SampleJenkins sjp=new SampleJenkins();
	String result=sjp.getData();
	System.out.println("The result is"+result);
System.out.println("WELCOME TO JENKINS");
}

public  String getData()
{
	return "Hello World from GetData";
}
}