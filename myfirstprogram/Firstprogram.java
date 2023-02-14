package corejava;

public class Firstprogram {

	public static void main(String[] args) 
	{
		 
		Sample s=new Sample();
		s.show();
		
		
	}

}
class Sample
{
	int a=10,b=20;
	void show()
	{
		System.out.println("values are "+a+" "+b);
		int sum=a+b;
		System.out.println("sum is "+ sum);
	}
}
