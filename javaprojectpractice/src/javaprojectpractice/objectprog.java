package javaprojectpractice;

public class objectprog {
			public static void main(String[] args) {
			
			 int [] arr = {20,4,20,1,4,9,1,6,4,1,0,1,4,7};
			 int tempcount=0;
			 int x=4;
			 for(int item:arr) 
			 {
				 if(item==4) {
					 
				 tempcount++;
				 
			      }
			  else
			 {
				 System.out.print("  "+item);
			 }
				 
		     }	
			for(int i =0;i<tempcount;i++) {
				
				System.out.print("  "+x);
			}
			for(int i=0;i<arr.length;i++) {
				System.out.print("   "+arr[i]);
			}
			
			
	     }
}
			

		
			
