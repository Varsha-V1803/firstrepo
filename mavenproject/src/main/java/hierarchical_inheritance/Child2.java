package hierarchical_inheritance;

public class Child2 extends Parent{

	public static void main(String[] args) {
		Child2 obj=new Child2();
		obj.method1();
		obj.method3();

	}
	public void method3()
	{
		 System.out.println("Method of child2 class");
	}

}
