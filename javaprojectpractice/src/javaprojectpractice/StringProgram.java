package javaprojectpractice;

public class StringProgram {
	public static void main(String[] args) {
		
//		//string
		String Fname="priyanka";
		String Lname="wani";
//		
	
//		System.out.println(Fname.substring(9));
//		//System.out.println("length is"+ Fname.length());
//		// compare 2 string
//		
//		if(Fname.compareTo(Lname)>0) {
//			System.out.println("string are equal");
//		}else
//		{
//			System.out.println("string are not equal");
//		}
//		
//		//print only priyanka
		String name="my name is priyanka";
		String newname=name.substring(11,19);
		System.out.println(newname);
		
//		//String builder
		
		
		 StringBuilder sb=new StringBuilder("priya");
		char[] ch= {'w','a','n','i'};
		String str1=new String("wani");
		String str2="wani priyanka";
		
		if(str1.equals(str2)) {
			System.out.println("string are equal");
		}
		else {
			System.out.println("string are not equal");
		}
		
//		 System.out.println(sb);
//		 
		 sb.setCharAt(0,'t');
//		 System.out.println(sb);
//		 
//		 sb.setCharAt(0, 'p');
//		 System.out.println(sb);
//
		 sb.insert(5,'a');
//		 System.out.println(sb);
//         
//		 sb.delete(5, 6);
//		 System.out.println(sb);
//		 
//		 sb.append("nka");
//		 sb.append("k");
//		 sb.append("a");
//		 System.out.println(sb);


	}
	   
}
