package sachinjava;

public class primenumber {

	public static void main(String args[]) {

		int n = 3;

		boolean flag = false;

		for (int i = 2; i<= n/2; i++) {

			if (n % i == 0) {

				flag = true;

				break;

			}
		}

			if (!flag) 

				System.out.println("your number is prime"+n);
			 else 

				System.out.println("your number is not prime"+n);
			

		

	}

}
