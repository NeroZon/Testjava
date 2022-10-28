package basicjava;

 class daughter {
	
void sachin() {
	
	System.out.println("bike passion");
	
}

 }
 
 class Parent extends daughter  {
  void sachin() {
	System.out.println("bike discover");
	
	
}
  
 }

  public class Child {

public static void main(String[] args) {
	
	daughter sa = new daughter ();
	sa.sachin();

	
	daughter sa1 = new Parent ();
	
     sa1.sachin();


}
}
 