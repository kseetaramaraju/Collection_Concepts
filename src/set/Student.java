package set;

public class Student implements Comparable<Student>
{
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return this.id;
	}

	@Override
	public boolean equals(Object obj) {
		Student s=(Student)obj;
		return this.id==s.id;
	}

	@Override
	public int compareTo(Student o) 
	{
		return this.id-o.id;
	}



}
