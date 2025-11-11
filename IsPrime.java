package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		int n = 16;
		int count = 0;
		int rem;
		for (int i = 1; i <= n; i++) {
			rem = n%i;
			if(rem==0) {
				count++;
			}
		}
		if (count==2) {
			System.out.println(n+"is a prime number");
		}
		else {
			System.out.println(n+"is not a prime number");
		}

	}

}
