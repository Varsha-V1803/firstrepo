package multilevel_inheritance;

public class ClassC extends ClassB{

	public static void main(String[] args) {
		ClassC obj=new ClassC();
		obj.method1();
		obj.method2();
		obj.method3();
	}
	public void method3()
	{
		 System.out.println("Method of child2 class");
	}
}
