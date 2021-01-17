class classA
{
	void methodOneClassA()
	{
		System.out.println("Method of ClassA");
	}
}

class classB extends classA
{
	void methodOneClassB()
	{
		System.out.println("Method of ClassB");
	}
}

class classC extends classB
{
	void methodOneClassC()
	{
		System.out.println("Method of ClassC");
	}
}


public class AllInheritaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		classC obj = new classC();
		obj.methodOneClassA();
		obj.methodOneClassB();
		obj.methodOneClassC();
	}

}
