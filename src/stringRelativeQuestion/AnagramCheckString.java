package stringRelativeQuestion;

import java.util.Arrays;
import java.util.Scanner;
public class AnagramCheckString 
{
	public static boolean checkAnagram(String str1,String str2)
	{
		char ch1[]=str1.toLowerCase().toCharArray();
		char ch2[]=str2.toLowerCase().toCharArray();
		boolean status=true;
		if(str1.length()!=str2.length())
		{
			status =false;
		}
		else
		{
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			status =Arrays.equals(ch1,ch2);
		}
		return status;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String:");
		String st=sc.nextLine();
		String st2=sc.nextLine();
		boolean status=checkAnagram(st,st2);
		if(status)
		{
			System.out.println("it is Anagram String");
		}
		else
		{
			System.out.println("it is not Anagram String");
		}
		sc.close();

	}

}
