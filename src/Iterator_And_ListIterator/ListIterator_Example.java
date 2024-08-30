package Iterator_And_ListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator_Example {
	public static void main(String[] args) {

		/* 
		 * 1 hasNext()
		 * 2 next()
		 * 3 remove()
		 * 4 hasPrevious()
		 * 5 previous()
		 * 6 nextIndex()
		 * 7 previousIndex()
		 * 
		 * */

		List<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);

		ListIterator<Integer> li = l.listIterator();


		while(li.hasNext())
		{
			System.out.println(li.next());
		}

		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}


	}
}
