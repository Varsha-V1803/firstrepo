package pack1;

public class First1 {

	public static void main(String[] args) {
		First1.method1(3.14f);
		First1 obj=new First1(31.1234);
		obj.method2(5, 1.2f);

	}
	public static void method1(float a)
	{
		System.out.println(a);
	}
	public void method2(int a,float b)
	{
		System.out.println(a);
		System.out.println(b);
	}
	public First1(double a)
	{
		System.out.println(a);
	}
}
