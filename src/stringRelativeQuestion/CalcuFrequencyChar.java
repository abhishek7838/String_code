package stringRelativeQuestion;

public class CalcuFrequencyChar {

	public static void main(String[] args)
	{
		String str="abhishekpratapsingh";
		char ch[]=str.toCharArray();
		int sum=0;
		for(int i=0;i<str.length();i++)
		{ 
			
			if(ch[i]!='\0')
			{
				int c=1;
			   for(int j=i+1;j<str.length();j++)
			    {
				   if(ch[i]==ch[j])
				     {
					    ch[j]='\0';
					    c++;
				     }
				   
			    }
			   sum=sum+c;
			   System.out.println(ch[i]+"-> "+c);
			 }
		}
		System.out.println(str.length());
		System.out.println(sum);
	}

}
