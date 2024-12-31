package pack1;

public class First2 {
	int a;//instance variable
	public static void main(String[] args) {
		First2 obj=new First2(16);
		obj.method1();
	}
	public First2(int b)//constructor
	{
		a=b;
	}
	public void method1()//instance method
	{
		System.out.println(a);
	}
}
