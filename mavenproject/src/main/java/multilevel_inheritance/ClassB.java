package multilevel_inheritance;

public class ClassB extends ClassA{

	public static void main(String[] args) {
		ClassB obj=new ClassB();
		obj.method1();
		obj.method2();

	}
	public void method2()
	{
		 System.out.println("Method of Child1 class");
	}
}
