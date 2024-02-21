package stringRelativeQuestion;

public class NonRepeatChar {

	public static void main(String[] args)
	{
		String str="abhishekpratapsingh";
		char ch[]=str.toCharArray();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++)
		{
			if(ch[i]!='\0')
			{
				int c=0;
				for(int j=i+1;j<str.length();j++)
				{
					if(ch[i]==ch[j])
					{
						c++;
						ch[j]='\0';
					}
					
				}
				if(c==0)
				{
					sb.append(ch[i]);
				}
			}
		}
		String str1=sb.toString();
		
		System.out.println(str1);
		

	}

}
