package add;

public class swaptonumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a = 10, b = 200;
		System.out.println("Befpre swapping values are .." + a + " " + b);

// logic 1 : third varible use normally
	/*	int t = a;
		a = b;
		b = t;

		System.out.println("after swapping values are .." + a + " " + b);
		*/
		//logic 2 : use+ & - without useing third varible
		
		/* a= a+b; 10 
		b=a-b;
		a=a-b;
		
		System.out.println(" after swapping values are "+a+" "+b);
		*/
		// logic 3 use * and / with out 3 rd varible 
		// a& b values should not be zero
		/*
		a=a*b; // 10*200=2000
		b=a/b;  // 2000/200=200
		a=a/b; // 2000/200= 10
		
		System.out.println("after swapping your numbewr" +a+""+b);
		*/
		// logic 4 bitwise XOR (^)
		/*
		a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.println("after swapping your number"+a+" "+b);
		*/
		// logic 5  single statement 
		
		b=a+b-(a=b);
		
		System.out.println("After swapping your number"+a+" "+b);
		
		
		
		

	}

}
