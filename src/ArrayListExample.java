import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayListExample ae = new ArrayListExample();
		int[] a= new int[5];
		a[0]=2;
		a[1]=4;
		a[2]=10;
		a[3]=5;
		a[4]=7;
		
		List<Integer> l= new ArrayList();
		
		ae.array(a, l);
		l.remove(5);
		System.out.println(l);
	}

	void array(int a[],List<Integer> l)
	{
		int i;
		for(i=0;i<a.length;i++)
		{
			l.add(a[i]);
		}
		//System.out.println(l);
		/*for(i=0;i<l.size();i++)
		{
			l.get(i);
			System.out.println(l.get(i));
		}*/
		for(i=l.size()-1;i>=0;i--)
		{
			l.get(i);
			System.out.println(l.get(i));
		}
		
	}
}
