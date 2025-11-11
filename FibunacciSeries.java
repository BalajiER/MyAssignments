package week1.day2;

public class FibunacciSeries {

	public static void main(String[] args) {
		int firstNum = 0;
		int secNum = 1;
		int range = 8;
		System.out.println(firstNum+", "+secNum+",");
		for (int i = 3; i <=range; i++) {
			int sum = firstNum+secNum;
			firstNum = secNum;
			secNum = sum;
			System.out.println(sum);
		}

	}

}
