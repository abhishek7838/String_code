package stringRelativeQuestion;

public class RemoveAllCharOnlyAlph {

	public static void main(String[] args) 
	{
		String str="abh4ish@ek  pra$ta9p s0in#g9h";
		char c[]=str.toCharArray();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++)
		{
		   if(str.charAt(i)!=' ')
		   {
			   sb.append(str.charAt(i));
		   }
		}
		String str1=sb.toString();
		System.out.println(str1);
		

	}

}
