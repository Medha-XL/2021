package JavaDemos;

public class student {
	
	int student_id; // Variable declaration in a class
	String student_name;
    static String College = "Vasavi Engineering College";
	String Group;
	
	public void displayStudentDetails() {
	    
		System.out.println("Student ID : " + student_id);
		System.out.println("Student Name : " + student_name);
		System.out.println("College Name : " + College);
		System.out.println("Group Name : " + Group);
		System.out.println(" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		student obj = new student();
		student obj1 = new student();
		
		System.out.println(obj.College);
		System.out.println(obj1.College);
		
		obj.student_id = 101;
		obj.student_name = "Ram";
		obj.Group = "MPC";
		obj.College = "GITHAM Engineering College";
		
		obj.displayStudentDetails();
		
		
		obj1.student_id = 201;
		obj1.student_name = "Vijay";
		obj1.Group = "Btech";
		
		obj1.displayStudentDetails();
		
	
	}

}
