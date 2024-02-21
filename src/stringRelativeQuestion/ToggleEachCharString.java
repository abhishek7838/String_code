package stringRelativeQuestion;

public class ToggleEachCharString {

	public static void main(String[] args) 
	{
		String str="AbhIshEK";
		StringBuilder sb1=new StringBuilder();
		StringBuilder sb2=new StringBuilder();
		for(char c:str.toCharArray())
		{
			if(Character.isLowerCase(c))
			{
				sb1.append(c);
			}
			else
			{
				sb1.append('\0');
			}
		}
		
		for(char c:str.toCharArray())
		{
			if(Character.isUpperCase(c))
			{
				sb2.append(c);
			}
			else
			{
				sb2.append('\0');
			}
		}
		System.out.println(str);
		System.out.println();
		String s=sb1.toString();
		String s2=s.toUpperCase();
		char ch1[]=s2.toCharArray();
		String s3=sb2.toString();
		String s4=s3.toLowerCase();
		char ch2[]=s4.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if(ch1[i]=='\0')
			{
				ch1[i]=ch2[i];
			}
		}
		System.out.println(ch1);
		

	}

}
