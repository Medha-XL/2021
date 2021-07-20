package AdvancedJavaPrograms;

class teacher {
	
	String designation = "Teacher";
	String college = "Vasavi";
	void display() {
		System.out.println("using the Car");
	}
}

public class mathTeacher extends teacher{
	
	String mainSubject = "Maths";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mathTeacher obj = new mathTeacher();
		teacher parent = new teacher();
		teacher input = new mathTeacher();
		
		System.out.println(obj.designation);
		System.out.println(obj.college);
		System.out.println(obj.mainSubject);
		System.out.print("Child is "); 
		obj.display();
		System.out.print("Parent is ");
		parent.display();
			
	}

}
