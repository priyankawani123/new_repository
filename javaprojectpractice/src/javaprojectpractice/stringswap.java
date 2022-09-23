package javaprojectpractice;

public class stringswap {

	public static void main(String[] args) {
		String a="ollo";
		String b="world";
		System.out.println(a+" "+b);
       
		a=a+b;
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		System.out.println(a+" "+b);
		
	}

}
