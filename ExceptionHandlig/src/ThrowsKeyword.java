import java.util.*;
public class ThrowsKeyword {
	static void Divide(int a, int b ) throws ArithmeticException{
		int c=a/b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		try {
		Divide(a,b);
		}catch(ArithmeticException e) {
			System.out.println("divide by zero error");
		}
		s.close();
		

	}

}
