package javaprojectpractice;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list =new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		
	
		list.remove(1);
		System.out.println(list);
		
		
//		list.clear();
//		System.out.println(list);
		list.get(1);
		System.out.println(list);
		System.out.println(list.size());
		
		//sorting arrlist
		Collections.sort(list);
        System.out.println(list);	
        
        //String arraylist
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("priya");
		list1.add("wani");
		list1.add("anil");
		list1.add("sagar");
		System.out.println(list1);
		System.out.println(list1.size());
		
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
	      Collections.sort(list1);
	      System.out.println(list1);
		
	}

}
