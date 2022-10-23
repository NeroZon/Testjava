package basicjava;

public class objectcalling {

	public void a() {
		
		int a = 5;
		System.out.println(a);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int data = 100;
  System.out.println(data);
  
  
  objectcalling v3 = new objectcalling() ;
  v3.a();
  }
	}

