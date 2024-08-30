package set;

import java.util.HashSet;
public class How_Set_Maintains_UniqueNess {
	public static void main(String[] args) {

		HashSet<Student> set=new HashSet<Student>();
		set.add(new Student(1,"a"));
		set.add(new Student(1,"a"));
		set.add(new Student(2,"b"));
		set.add(new Student(2,"b"));
		set.add(new Student(3,"c"));

		for(Student s:set)
		{
			System.out.println(s);
		}

	}
}
