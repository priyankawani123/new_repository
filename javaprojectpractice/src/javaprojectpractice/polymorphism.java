package javaprojectpractice;
	
public class polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee1 obj=new employee1();
		obj.employee(12, 34);
		obj.employee("priya");
		   
	}
}
class employee1  {
	public  void employee(int a,int b) {
		System.out.println(a+b);
	}
	public void employee(String s) {
		System.out.println(s);
	}
	
}

class employee2 extends employee1{
	public  void employee(int a,int b) {
		System.out.println("priya");
	}
}

class a
{
	}

class b extends a{
	
}

class c extends b{
	
}

class d extends a{
	
}

