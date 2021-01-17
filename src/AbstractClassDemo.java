abstract class AbstractClassOne
{
	int a=10;
	abstract void myMethod();
	void myMethod(int x)
	{
		System.out.println("I am a super class, not abstract mentod. Am a concrete method");
	}
}


public class AbstractClassDemo extends AbstractClassOne{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractClassOne obj = new AbstractClassDemo();
		System.out.println("I am a data member from Super class and my value is " + obj.a);
		obj.myMethod();
		obj.myMethod(20);
		}
		 
		@Override
		void myMethod() {
		 
		System.out.println("I am in child class");
		}
		 
	}