import java.util.*;
public class RecursionFactorial {
	public static long fact(int n) {
		long result=1;
		if(n==0) {
			return result;
		}
		result = n *fact(n-1);
		return result;
	}
	public static void main(String args[]) {
		System.out.println("Enter no.");
		Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();
		System.out.println(fact(n));
	}
}
