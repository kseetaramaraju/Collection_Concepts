package list;

import java.util.Vector;

public class Vector_intial_And_Incremental_Capacity {
	public static void main(String[] args) {


		Vector<Integer> v=new Vector<Integer>(10,60);
		v.add(10);
		v.add(10);
		v.add(10);
		v.add(10);
		v.add(10);
		v.add(10);

		v.add(10);

		v.add(10);

		v.add(10);
		v.add(10);

		System.out.println(v.capacity()); 

		v.add(10);

		System.out.println(v.capacity());




	}
}
