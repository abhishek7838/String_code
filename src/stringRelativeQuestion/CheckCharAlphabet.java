package stringRelativeQuestion;


public class CheckCharAlphabet {

	public static void main(String[] args) 
	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter a String:");
//		String str=sc.nextLine();
		char ch='a';
		
		if((ch >='a' && ch <= 'z' )||(ch >= 'A' && ch <= 'Z'))
		{
			System.out.println("Character is a alphabet");
		}
		else
		{
			System.out.println("Character is Not a Alphabet");
		}
		
		
		

	}

}
