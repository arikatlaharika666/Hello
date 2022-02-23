
public class Test2 {
	
	void display(Object o) {
		System.out.println("object");
	}
	void display(String str) {
		System.out.println("String");
	}
	public static void main(String[] args) {
		new Test2().display(null);
	}

}
