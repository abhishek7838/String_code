package checkingAllMethodOfString;

import java.util.*;
public class FirstCharAt {

	public static void main(String[] args)
	{
		String str="programminglanguage";
		
		
		LinkedHashSet<Object> al=new LinkedHashSet<Object>();
		System.out.println("storing the reverse element from string to LinkedHashSet");
		for(int i=str.length()-1;i>=0;i--)
		{
			al.add(str.charAt(i));
		}
		System.out.println();
		System.out.println("after Adding Completed become length of LinkedHashSet Size");
		System.out.println("String Length-> "+str.length());
		System.out.println("ArrayList Size-> "+al.size());
		System.out.print("LinkedHashSet current -> ");
		System.out.println(al);
		System.out.println("==================================");
		System.out.println("retrieving the element from LinkedHashSet by using Iterator");
		System.out.println();
		Iterator<Object> i=al.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next());
		}
		System.out.println();
		System.out.println("============================");
		System.out.println("using for loop for making new String without duplicate character ");
		Object ob[]=al.toArray();
		String s=Arrays.toString(ob);
		System.out.println("new String length-> "+s.length());
		char ch[]=new char[s.length()];
		int x=0;
		for(int b=s.length()-1;b>=0;b--)
		{
			ch[x++]=s.charAt(b);
		}
		String s2=ch.toString();
		System.out.println();
		
		
		
		
		
		
//		for(int k=0;k<al.size();k++);
//		{
//			System.out.println();
//		}
        
		
		
	}

}
