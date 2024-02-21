package stringRelativeQuestion;

import java.util.Scanner;
public class ReplaceSubString
{
	public static String replaceSubString(String orig,String toReplace,String newWord)
	{
		String result;
		if(orig.contains(toReplace))
		{
			result=orig.replaceAll(toReplace,newWord);
		}
		else
		{
			result=orig;
		}
		
		return result;
		
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a String or Sentence:");
		String origin=sc.nextLine();
		System.out.println("enter which word we want replace");
		String toReplace=sc.next();
		System.out.println("enter a modified word");
		String newWord=sc.next();
		 String result=replaceSubString(origin,toReplace,newWord);
		 System.out.println(result);
		 sc.close();
		

	}

}
