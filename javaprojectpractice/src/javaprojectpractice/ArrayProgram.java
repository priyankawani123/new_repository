package javaprojectpractice;

public class ArrayProgram {
	public static void main(String [] args) {
		
		int[] arr= {3,5,6,1,3,2};
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		
		for (int i = 0; i < arr.length; i++)   
		{  
		for (int j = i + 1; j < arr.length; j++)   
		{  
			
		int tmp = 0;  
		if (arr[i] > arr[j])   
		{  
		tmp = arr[i];  
		arr[i] = arr[j];  
		arr[j] = tmp;  
		}  
		}  
		
		//prints the sorted element of the array  
		System.out.print(arr[i]);  
		}  
		
		//System.out.println(arr[arr.length-2]);
	}   

}
