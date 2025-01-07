//this keyword-instance variable
package pack1;
public class First3 {
	int b;//instance variable
	public static void main(String[] args) {
		First3 obj=new First3(16);
		obj.method1();
	}
	public First3(int b)//constructor,here the argument b is local variable
	{
		this.b=b;//this is used to distinguish between the local variable b and the instance variable b.
	}
	public void method1()//instance method
	{
		System.out.println(b);
	}
}
