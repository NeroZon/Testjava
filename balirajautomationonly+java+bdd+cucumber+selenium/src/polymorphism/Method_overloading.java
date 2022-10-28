package polymorphism;

public class Method_overloading {
	
	public static void area(String Circle) {
		
		System.out.println("circle");
	}
	
	public static void area (String Circle,String Tringle) {
		
		System.out.println("circle and Triangle");
	}
	
	public static void area (String Circle,String Triangle,String Rectangle){
		
		
	System.out.println("circle and Triangle and rectangle");	
	} 
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Method_overloading mo = new Method_overloading();
		mo.area("Circle");
		mo.area("Circle", "Triangle");
		mo.area("Circle", "Triangle", "rectangle");
		
	}

}
