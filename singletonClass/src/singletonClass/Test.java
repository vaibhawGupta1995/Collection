package singletonClass;

class Student{
	
	private static Student student;  // Intance Variable
	
	private Student() {  //Constructor
		
	}
	public static Student getStudent() {  // Static method of getting object of Student class
		if(student==null) {
			student= new Student();       
		}
		return student;
	}
}
public class Test {
	public static void main(String[] args) {
		//Student s=new Student();
		Student s1 = Student.getStudent();
		System.out.println(s1.hashCode());
		
		Student s2 = Student.getStudent();
		System.out.println(s2.hashCode());
		
	}

}
