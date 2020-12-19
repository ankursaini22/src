import java.util.Arrays;

public class FiboDP{
	public static int fibo(int n) {
		int result=0;
		int memo[]=new int[n+1];
		Arrays.fill(memo, -1);
		if(memo[n]==-1) {
			if(n==1 || n==0) {
				result =n;
			}
			else {
				result=fibo(n-1)+fibo(n-2);
			}
			memo[n]=result;
		}
		return memo[n];
	}
	public static void main(String args[]) {
		int n=9;
		System.out.println(fibo(n));
	}
}