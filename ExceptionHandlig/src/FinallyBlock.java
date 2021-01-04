import java.util.*;
public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		try {
			int c=a/b;
			System.out.println(c);
		}catch(NullPointerException e) {
			System.out.println("exception");
		}
		finally {
		System.out.println("hello"+" ");
		s.close();
		}
	

	}

}
