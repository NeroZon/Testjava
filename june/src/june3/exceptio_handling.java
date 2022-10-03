package june3;

public class exceptio_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {  
			
			int a =10;int b=0;int c;
		
		c=a/b;
		
		System.out.println("your divivsion answer:"+c);
	}
	
	catch ( Exception e ){
		
		
		System.out.println("your operation is wrong");
		
	}
		
		finally {
			
			System.out.println("check your operation");
			
		}
		
		
		
	}

}
