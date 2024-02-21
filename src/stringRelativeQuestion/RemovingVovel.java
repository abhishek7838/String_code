package stringRelativeQuestion;

//import java.util.*;
public class RemovingVovel {

	public static void main(String[] args) 
	{
		String st="abhishek";
		int vowel=0;
		char ch[]=st.toCharArray();
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)=='a'||st.charAt(i)=='e'||st.charAt(i)=='i'||st.charAt(i)=='o'||st.charAt(i)=='u')
			{
				vowel++;
			}
		}
		System.out.println(vowel);
		
		

	}

}
