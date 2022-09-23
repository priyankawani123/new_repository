package javaprojectpractice;


class staticconstructor{
	public static void main(String[] args) {
		String str="aabbcc";
		int count=0;
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)=='b') {
				count++;
			}
			
		}System.out.println(count);
		
	}

}
