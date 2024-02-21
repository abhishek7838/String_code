package checkingAllMethodOfString;

public class RemoveAllMethod {

	public static void main(String[] args) 
	{
		String str="(a+b)+{x+z}+[k-p]";
		String str2=str.replaceAll("[(){}ap]","");
		System.out.println(str2);
		

	}

}
