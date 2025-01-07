//Single inhertance
package inheritance;

public class Child extends Parent{

	public static void main(String[] args) {
		Child obj=new Child();
		obj.display();//calling the parent class method
		obj.method1();//calling the child class method
		System.out.println(obj.d);
	}
	public void method1()
	{
		System.out.println("Hello world");
		//System.out.println(d);//instance variable is printed via the child class instance method
	}

}
