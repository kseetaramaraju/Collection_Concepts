package set;

import java.util.TreeSet;

public class compareTo_example {
	public static void main(String[] args) {


		TreeSet<Student> set=new TreeSet<Student>();
		set.add(new Student(1,"a"));
		set.add(new Student(1,"e"));
		set.add(new Student(2,"b"));
		set.add(new Student(2,"f"));
		set.add(new Student(3,"c"));

		for(Student s:set)
		{
			System.out.println(s);
		}

		//		TreeSet t=new TreeSet();
		//
		//		t.add(10);
		//		t.add(new Student(1,"a"));
		//		t.add("sdsad");
		//
		//		for(Object s:t)
		//		{
		//			System.out.println(s);
		//		}
		//	class castexception will occur


	}

}
