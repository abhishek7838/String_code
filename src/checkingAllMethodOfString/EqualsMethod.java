package checkingAllMethodOfString;

public class EqualsMethod {

	public static void main(String[] args) 
	{
		String str="java";
		String str2="oracle";
		String str3=new String("java");
		String str1=new String("java");
		String str4=new String("oracle");
		
		StringBuffer str5=new StringBuffer("java");
		StringBuffer str6=new StringBuffer("java");
		StringBuilder str7=new StringBuilder("java");
//		StringBuilder str8=new StringBuilder("java");
		
//		System.out.println(str3.equals(str));//true
//		System.out.println(str1.equals(str3));//true
//		System.out.println(str2.equals(str4));//true
//		System.out.println(str.equals(str5));//false
//		System.out.println(str3.equals(str5));//false
//		System.out.println(str5.equals(str3));//false
		System.out.println(str6.equals(str7));
		System.out.println(str7.equals(str6));
		
		
//		System.out.println(str.equals(str2));//false
//		System.out.println(str.equals(str3));//true
//		System.out.println(str1.equals(str4));//false
//		System.out.println(str1.equals(str5));//true
//		System.out.println(str5.equals(str1));//true
//		System.out.println(str5.equals(str6));//true
//		System.out.println(str5.equals(str7));//false
//		System.out.println(str7.equals(str5));//false
//		System.out.println(str7.equals(str8));//false
//		System.out.println(str7.equals(str1));//false
//		System.out.println(str7.equals(str4));//false
//		System.out.println(str.equals(str4));//false
		
		

	}

}
