package stringRelativeQuestion;

public class CheckVowelCount {

	public static void main(String[] args)
	{
		String str="karisADSAsdfACV";//duplicate latter remove from String
		String str2="";
		str=str.toUpperCase();
		str2=str.replaceAll("[aieou]","");
		System.out.println(str2);
		
//		int c=0;
//		String str2=new String("ab");
//		System.out.println(str2);
////		for(int i=0;i<str.length();i++)
////		{
////			for(int j=i+1;j<str.length();j++)
////			{
//				if(str.charAt(i)==str.charAt(j))
//				{
//					c++;
//				}
//			}
//		}
		
		
		

	}

}
