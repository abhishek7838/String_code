package checkingAllMethodOfString;

import java.util.*;

public class DuplicateCharacter {

	public static void main(String[] args)
	{
		//String str="programminglanguage";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		
		String ch=sc.next();
		int i=1,vowel=0,consonant=0;
		
		  for(int j=0;j<ch.length();j++)
		  {
			  if(ch.charAt(j)=='o' || ch.charAt(j)=='a' || ch.charAt(j)=='i'|| ch.charAt(j)=='e' || ch.charAt(j)=='u')
				{
				  vowel++;
				System.out.println("vowel.     "+(i++)+"->"+ch.charAt(j));
				}
				else
				{
					consonant++;
					System.out.println("Consonant. "+(i++)+"->"+ch.charAt(j));
				}
		  }
		  System.out.println("Total Vowel-> "+vowel);
		  System.out.println("Total consonant-> "+consonant);
		sc.close();
				
		
		
//		LinkedHashSet<Character> al=new LinkedHashSet<Character>();
//		for(char c:ch)
//		{
//			al.add(c);
//		}
//		StringBuilder sb=new StringBuilder();
//		for(char c:al)
//		{
//			sb.append(c);
//		}
//		String st=sb.toString();
//		System.out.println(st);
		
		
	}

}
