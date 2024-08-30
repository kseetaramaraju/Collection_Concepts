package Iterator_And_ListIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Interator_Example {
	public static void main(String[] args) {

		List<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);

		Iterator<Integer> iterator = l.iterator();

		while(iterator.hasNext())
		{
			Integer num = iterator.next();
			if(num==20)
			{
				iterator.remove();
			}
			System.out.println(num);
		}
         System.out.println(l);

	}
}
