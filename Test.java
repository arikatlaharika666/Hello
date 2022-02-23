
public class Test extends Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			throw new Test();
		}
		catch(Test t){
			System.out.println("1");
			
		}finally {
			System.out.println("2");
		}
		try {
			int x=7/0;
		}
		catch(Exception m) {
			System.out.println("1");
		}
finally {
	System.out.println(0);
}
	}

}
