package megha_practices;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Course_Sorted {

	public static void main(String[] args) {
		
		//SortedSet<Course> courseSet=new TreeSet<>();
		SortedSet<Course> courseSet = new TreeSet<>((o1, o2) -> Integer.compare(o1.getCouresId(), o2.getCouresId()));
		courseSet.add(new Course(101,"Java Intern","Megha"));
		courseSet.add(new Course(102,"Asp.net","padma"));
		courseSet.add(new Course(104,"Java Intern","Sruti"));
		courseSet.add(new Course(103,"Phython","Ammu"));
		courseSet.add(new Course(101,"Java Intern","aa"));
		
		
		System.out.println("Sizes:\t"+courseSet.size());
		for(Course course:courseSet) {
			System.out.println(course);
		}
		
		
	

	}

}
