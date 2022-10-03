package june3;

public class palindromenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int reminder = 0, reversenumber = 0;
		int num = 196;
		int temp = num;
		while (num > 0) {

			reminder = num % 10;
			reversenumber = (reversenumber * 10) + reminder;
			num = num / 10;

		}

		if (temp == reversenumber) {

			System.out.println("the number is palindrome");
		} else {

			System.out.println("The Number is not Palindrome");
		}
	}

}
