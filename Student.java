package org.college;

public class Student extends Department {
	
	public void studentName() {
		
		System.out.println("venkat");
		

	}
	
	
	public static void main(String[] args) {
		
		Student obj=new Student();
		
		
		obj.studentName();
		obj.deptName();
		
		
		obj.collegeCode();
		
		
	}

}
