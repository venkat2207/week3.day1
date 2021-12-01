package week3.day1.practice;

public class IgnoreCase {

	public static void main(String[] args) {
		
		String str1="I am Learning Java";
		
		String str2="I am learning java";
		
		if (str1==str2)
		{
			System.out.println("hi");
			
		}
		
		else if (str1.equalsIgnoreCase(str2))
			
		{
			System.out.println("hello");
			
		}
		
		else if (str1.equals(str2))
			
		{
			System.out.println("same");
			
		}
		
		else
			
		{
			
			System.out.println("not match");
		}

	}

}
