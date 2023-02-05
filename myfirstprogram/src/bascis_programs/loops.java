package bascis_programs;
import java.util.Scanner;
// recursion for factorial
public class loops {
//	public static int fact(int num)
//	{
//		if(num==0)
//		{
//			return 1;
//		}
//		else
//		{
//			return num * fact(num -1);	
//		}
//		
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		
//		int n=4;
//		fact(n);
//		System.out.println(fact(n));
	



	//public class Solution {
	    public static void main(String[] args)  {
	       Scanner sc=new Scanner(System.in);
	        int mul=sc.nextInt();
	        int times=sc.nextInt();
	       
	        for(int i=1;i<=times;i++)
	        {
	           
	            System.out.println(mul+"*"+i+"= "+mul*i);
	        }
	    }
}

	


