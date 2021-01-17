abstract class Mobile{
	String apps = "Whatsapp";
	abstract void mymessage();
	void mymessage(String app)
	{
		System.out.println("this message is from "+apps);
	}
	
}
public class AbstractMobile extends Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mobile obj = new AbstractMobile();
		obj.mymessage("mailbox");
		obj.mymessage();
		
	}
		void mymessage()
		{
			System.out.println("Implementing abstract method");
		}
}
