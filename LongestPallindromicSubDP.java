import java.util.Arrays;

public class LongestPallindromicSubDP {
	public static void check(String str) {
		int n=str.length();
		int dp[][]=new int[n][n];
		int maxlength=0;
		int start=0;
		
		for(int i=0;i<n;i++) {
			dp[i][i]=1;
			maxlength=1;
			start=i;
		}
		
		for(int[] row :dp) {
			System.out.println(Arrays.toString(row));
		}
		for(int i=0;i<n-1;i++) {
			if(str.charAt(i)==str.charAt(i+1)) {
				dp[i][i+1]=1;
				maxlength=2;
				start=i;
			}
	}
		
		System.out.println("++++++++++++++++++");
		for(int[] row :dp) {
			System.out.println(Arrays.toString(row));
		}
	
		for(int k=3;k<=n;k++) {
			for(int i=0;i<n-k+1;i++) {
				int j=i+k-1;
				if(str.charAt(i)==str.charAt(j) && dp[i+1][j-1]==1) {
					dp[i][j]=1;
					if(k>maxlength) {
					maxlength=k;
					start=i;
					}
				}
			}
			
		}
		System.out.println("++++++++++++++++++");
		for(int[] row :dp) {
			System.out.println(Arrays.toString(row));
		}
		
			System.out.println("STRAT"+start+"Lnegtgh"+maxlength);
		for(int i= start;i<start+maxlength;i++) {
			System.out.print(str.charAt(i));
		}
		
	}
	public static void main(String args[]) {
		String str="ankurabba";
		check(str);
	}
}