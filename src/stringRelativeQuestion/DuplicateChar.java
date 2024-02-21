package stringRelativeQuestion;

public class DuplicateChar {

	public static void main(String[] args) 
	{
		String str="programming";
		char ch[]=str.toCharArray();
		int c=0,d=0;
		StringBuilder sb=new StringBuilder("");
		StringBuilder sb1=new StringBuilder("");
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					c++;
					sb.append(str.charAt(i));
					continue;
				}
			}
		}
		for(int i=0;i<sb.length();i++)
		{
			for(int j=0;j<str.length();j++)
			{
			if(ch[j]!=sb.charAt(i));
			{
				d++;
				sb1.append(str.charAt(i));
			}
			}
			
			
		}
		System.out.println(str);
		System.out.println(c+" "+d);
		System.out.println(sb);
		System.out.println(sb1);

	}

}
