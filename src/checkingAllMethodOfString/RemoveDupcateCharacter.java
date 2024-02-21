package checkingAllMethodOfString;

import java.util.*;
public class RemoveDupcateCharacter 
{
	public static String removeDuplicate(String str2)
	{
		LinkedHashSet<Character> lhs=new LinkedHashSet<Character>();
		for(int i=0;i<str2.length();i++)
		{
			lhs.add(str2.charAt(i));
		}
		StringBuilder sb=new StringBuilder();
		Iterator<Character> i1=lhs.iterator();
		while(i1.hasNext())
		{
			sb.append(i1.next());
		}
		
		return sb.toString();
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String ");
		String str=sc.next();
	
		String str2=str.toLowerCase();
		String result=removeDuplicate(str2);
		System.out.println(result);
		sc.close();
		
		
	}

}
