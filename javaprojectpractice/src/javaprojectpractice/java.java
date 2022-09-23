package javaprojectpractice;

public class java {

	public static void main(String[] args) {
		//swap number
		/*int a=10;
		int b=20;
		
		System.out.println("Before swaping"+ a+" "+ b);
		
		int t=a;
		a=b;
		b=t;
	
		System.out.println("after swaping"+ a+" "+ b);
		
		// second logic 
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swaping"+ a+" "+ b);
		*/
		
		
		//reverse string
		
		
//		String str="priyanka and sunita";
//		String rev="";
//		
//		int len=str.length();
//		
//		for(int i=len-1;i>=0;i--)
//		{
//			 rev=rev+str.charAt(i);
//		}
//		
//		System.out.println("revers string is "+rev);
//		
//		}
//}
		
		// reverse number
		
//		int num=12325, rev=0;
//		//int orgnum=num;
//		while(num!=0)
//		{
//			
//			rev=rev*10+num%10;
//			num=num/10;
//		}
//		
//		System.out.println("revers no is"+rev);
//		}
//}
		
		// palindrom string
		String str = "priya", reverseStr = "";
	    
	    int strLength = str.length();

	    for (int i = (strLength - 1); i >=0; --i) {
	      reverseStr = reverseStr + str.charAt(i);
	    }

	    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
	      System.out.println(str + " is a Palindrome String.");
	    }
	    else {
	      System.out.println(str + " is not a Palindrome String.");
	}
	}
}
		// palindrom number
//		int num=121 ,rev=0;
//		int orgnum=num;
//		while(num!=0) 
//		{ 
//			rev=rev*10+num%10;
//			num=num/10;
//			          
//		}
//		System.out.println(rev);
//		 if(orgnum==rev) {
//			System.out.println("palindrom no");
//		 }
//		else 
//		{
//			System.out.println("not palindrom");
//		}
//		
//	
//	}
//}


////fibonacy series
//		int a=0, b=2, c;
//		System.out.println(a+" "+b);
//		//int  c;
//		for(int i=1;i<=5;i++)
//		{
//			c=a+b;
//			System.out.println(""+c);
//			a=b;
//			
//			b=c;
//	}
//	}
//}

