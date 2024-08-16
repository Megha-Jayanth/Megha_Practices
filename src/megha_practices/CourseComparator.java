package megha_practices;

import java.util.Comparator;

public class CourseComparator implements Comparator<Course>{

	public static void main(String[] args) {
		
	}

	@Override
	public int compare(Course o1, Course o2) {
		
		System.out.println("By Using Comparator: Student Name");
		int i1=o1.getCouresId();
		int i2=o2.getCouresId();
		
		if(i1==i2) {
			return 0;
		}else if(i1<i2) {
			return -1;
		}else {
			return 1;
		}
		
	}

}
