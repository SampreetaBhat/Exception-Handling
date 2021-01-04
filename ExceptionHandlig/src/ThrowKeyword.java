import java.util.*;
class MyException extends Exception{
	public MyException(String s) {

	super(s);
	}
}
public class ThrowKeyword{
public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		try {
			throw new MyException("sampreeta");
		}
			catch(MyException e) {
		System.out.println("error");
		System.out.println(e.getMessage());
		}
		finally {
			s.close();
		}
		

	}

}
