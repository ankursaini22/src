
public class ReversingAnArray {
	public static void main(String args[]) {
		int[] arr= {2,1,5,3,3,5,1};
		int left=0;
		int right=arr.length-1;
		while(left<right) {
			int t=arr[left];
			arr[left]=arr[right];
			arr[right]=t;
			left++;
			right--;
		}	
	for(int i :arr) {
		System.out.print(i+" ");
	}
	}
}
