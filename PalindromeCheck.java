package week1.day2;

public class PalindromeCheck {

	public static void main(String[] args) {
		int input = 898;
		int output = 0;
		int rem,i;
		for( i=input; i>0; i=i/10){
			rem = i % 10;
			output = (output*10)+rem;					
		}
		
		if (input == output) {
			System.out.println("Palindrome");}
		else {
			System.out.println("Not Palindrome");}
	}

}
