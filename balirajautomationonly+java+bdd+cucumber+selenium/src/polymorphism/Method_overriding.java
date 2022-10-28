package polymorphism;

class Method_overriding1 {
	
	public void area() {
		
		
		System.out.println("area");
	}
}
	 public class Method_overriding extends Method_overriding1{
		
	public void area() {
		
		System.out.println("circle");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Method_overriding1 mo1 = new Method_overriding ();
		//Method_overriding mo = new circle ();
		mo1.area();
		mo1.area();

	}

}

