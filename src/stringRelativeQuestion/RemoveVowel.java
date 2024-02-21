package stringRelativeQuestion;

public class RemoveVowel {

	public static void main(String[] args)
	{
		String str="programming";
		char ch[]=str.toCharArray();
		int vowel=0;
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++)
		{
			if(ch[i]=='a'|| ch[i]=='e' || ch[i]=='i'|| ch[i]=='o' || ch[i] == 'u')
			{
				vowel++;
			}
			else
			{
				sb.append(ch[i]);
			}
		}
		String str2=sb.toString();
		System.out.println(str.length());
		System.out.println("Vowel-> "+vowel);
		System.out.println("consonent-> "+sb.length());
		System.out.println(str2);
		

	}

}
