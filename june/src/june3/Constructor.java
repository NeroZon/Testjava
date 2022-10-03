package june3;

public class Constructor {
	
	
	int id ;
	String name ; 
	
	public Constructor () {
		
		//default Constructor
		
		System.out.println("Default constructor");
	}
		
		public Constructor (int id  , String name) {
			
			// parameterised constructor
			this.id = id;
			this.name = name ;
			System.out.println("Id :"+id);
			System.out.println("Name:" +name);
		}
		
		public static void main(String[] args) {
			new Constructor ();
			new Constructor (10,"sachin");
		}
		
		
	}

	
	
	
	

