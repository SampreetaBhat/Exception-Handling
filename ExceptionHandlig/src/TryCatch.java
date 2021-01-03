import java.util.*;
public class TryCatch {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        try {
        int c=a/b;
        System.out.println(c);
        }catch(ArithmeticException e) {
        	System.out.println("divide by zero error");
        }
        System.out.println("hello");
        s.close();
	}

}
