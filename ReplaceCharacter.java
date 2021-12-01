package week3.day1.practice;

public class ReplaceCharacter {

	public static void main(String[] args) {
		
		String sentence = "I am working with Java8";
		
		String replaceString=sentence.replace("8","11");
		
		System.out.println(replaceString);
		
		System.out.println(replaceString.substring(5, 11));

	}

}
