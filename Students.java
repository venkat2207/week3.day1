package org.student;

public class Students {
	
	public void getStudentInfo(double ID) {
		
		System.out.println("ID is "+ ID);
	
	}
	
	public void getStudentInfo(double ID,String name) {
		
		System.out.println("name of the person is "+ name + "id is "+ ID);
		

	}
	
	
	public void getStudentInfo(String emailID, String name) {
		
		System.out.println("email id of the person is " + emailID + " and name is " + name);
		

	}
	
	
	public static void main(String[] args) {
		
		Students obj=new Students();
		
		obj.getStudentInfo(23, "venkat");
		
		obj.getStudentInfo("ven@123.com", "sam");
		
	}

}
