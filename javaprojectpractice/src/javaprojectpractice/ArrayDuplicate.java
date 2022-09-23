package javaprojectpractice;

public class ArrayDuplicate {

	public static void main(String[] args) {
		
		String[] arr1= {"priya","anil","sachin","priya"};
		
		/*integer array declaration
		int[] arr2= {1,2,3,4};
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}*/
		
		int len=arr1.length;
		for(int i=0;i<len;i++) {
			
			for(int j=i+1;j<len;j++) {
				
				if(arr1[i].equals(arr1[j])) {
					
					System.out.println("duplicate array is"+" "+arr1[i]);
				}
					
			}
		}
		
	}

}
