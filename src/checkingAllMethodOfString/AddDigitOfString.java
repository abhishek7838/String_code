package checkingAllMethodOfString;

import java.util.*;
public class AddDigitOfString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a sentence:");
		String str=sc.nextLine();
		int sum=0;
		StringTokenizer st=new StringTokenizer(str,"");
		
		while(st.hasMoreElements())
		{
			String s=st.nextToken();
//			StringBuffer sb=new StringBuffer(s);
			char ch[]=s.toCharArray();
			for(char c:ch)
			{
				if(Character.isDigit(c))
				{
					sum=sum+(c-'0');
				}
			}
			
		}
		System.out.println(sum);
		sc.close();
		
	}

}
