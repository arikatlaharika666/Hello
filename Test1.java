
public class Test1 {
	
	int Test1(int i) {
		System.out.println("Test 2");
		return i;
	}
	Test1(){
		System.out.println("Test1");
	}

	public static void main(String[] args) {
		Test1 test=new Test1();
		System.out.println(test.Test1(5));

	}

}
