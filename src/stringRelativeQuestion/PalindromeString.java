package stringRelativeQuestion;

public class PalindromeString {

	public static void main(String[] args) 
	{
		String str="level";
		System.out.println("before-> "+str);
		StringBuilder sb=new StringBuilder();
		for(int i=str.length()-1;i>=0;i--)
		{
			sb.append(str.charAt(i));
		}
		String str1=sb.toString();
		System.out.println("after-> "+str1);
		if(str.equals(str1))
		{
			System.out.println("it is palindrome");
		}
		else
		{
			System.out.println("it is not palindrome");
		}
		
	}

}
