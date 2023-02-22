package corejava;

public class ForEachLoop {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60};	
		//for integer array
				for(int i:a)
				{
				System.out.print(i+" ");	
				}
				
				char c[]= {'j','a','v','a'};
				for(char i:c)
				{
					System.out.print(i);		
				}
				System.out.println(" ");
				String s1[]= {"Java","programming","learning"};
		//for String array
				for(String s:s1)
				{
					System.out.print(s+" ");		
				}

	}

}
