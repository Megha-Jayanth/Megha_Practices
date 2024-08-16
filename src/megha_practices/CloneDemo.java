package megha_practices;

public class CloneDemo {
	
	public static class Student implements Cloneable{
		int rollno;
		String name;
		/**
		 * @param rollno
		 * @param name
		 */
		public Student(int rollno, String name) {
			super();
			this.rollno = rollno;
			this.name = name;
		}
		
		public Student(Student s1) {
			// TODO Auto-generated constructor stub
		}

		public Object clone() throws CloneNotSupportedException{
			return super.clone();
			
		}
		
	}

	public static void main(String[] args) {
		try {
			
			Student s1= new Student(101, "Megha");
			Student s2=(Student) s1.clone();
			Student s3=new Student(s1);
			System.out.println(s1.rollno + " " + s1.name);	
			System.out.println(s2.rollno+" "+s2.name);
			
		}
		catch(CloneNotSupportedException c) {
			c.printStackTrace();
		}

	}

}
