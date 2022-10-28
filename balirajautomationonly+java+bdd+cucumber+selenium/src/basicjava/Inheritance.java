package basicjava;

class child {

	public void bike() {

		System.out.println("Hero");
	}
}

class parrent extends child {

	public void cycle() {

		System.out.println("Atlus");

	}

}

public class Inheritance {

	public static void main(String[] args) {

		child ch = new child();
		ch.bike();

		parrent pa = new parrent();
		pa.cycle();

	}
}
