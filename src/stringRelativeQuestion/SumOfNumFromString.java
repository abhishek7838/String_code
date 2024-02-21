package stringRelativeQuestion;

public class SumOfNumFromString {

	public static void main(String[] args)
	{
		String str="my 34 nam4e i3s ab1his6hek p8rat9ap s2in4gh";
		char ch[] =str.toCharArray();
		int sum=0;
		for(char c: ch)
		{
			if(Character.isDigit(c))
			{
				sum=sum+(c-'0');
				
			}
		}
		System.out.println("final-> "+sum);

	}

}
