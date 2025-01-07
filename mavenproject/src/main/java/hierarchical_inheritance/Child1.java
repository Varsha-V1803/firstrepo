package hierarchical_inheritance;

public class Child1 extends Parent{

	public static void main(String[] args) {
		Child1 obj=new Child1();
		obj.method1();
		obj.method2();

	}
	public void method2()
	{
		 System.out.println("Method of child1 class");
	}

}
