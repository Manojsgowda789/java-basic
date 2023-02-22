package corejava;

public class IfDemo {

	public static void main(String[] args) {
		// print consecutive words
		String s="aaabbbaaa";
		int length=s.length();
		
		String s1="";
		
		
			s1=String.valueOf(s.charAt(0));
			for(int i=1;i<length-1;i++)
			{
			if(s.charAt(i)!=s1.charAt(s1.length()-1) )
			{
				s1=s1+s.charAt(i);
			}
				
		
		}System.out.println(s1);
//		String input="aabbaabb";
////		
//		int length=input.length();
//
//		if(length>1)
//		{
//			String res=String.valueOf(input.charAt(0));
//			
//			for(int i=1;i<length;i++)
//			{
//				if(res.charAt(res.length()-1)!=input.charAt(i))
//				{
//					res+=input.charAt(i);
//				}
//			}
//			System.out.println(res);
//		}
//		else if(length==1)
//		{
//			System.out.println(input);
//		}
		
		
		
	}

}
