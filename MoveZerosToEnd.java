
public class MoveZerosToEnd {

	public static void main(String args[]) {
		/*//Better Approach
		int[] arr= {0,2,6,0,1,0,5,6,0,6,9,0,3,5,0,4,7,0};
		int count=0;
		for(int i: arr) {
			System.out.print(i+" ");
		}
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=0) {
				int temp= arr[i];
				arr[i]=arr[count];
				arr[count]=temp;
				count++;
			}
		}
		System.out.println();
		for(int i: arr) {
			System.out.print(i+" ");
		}
		*/
		// Naive
		int[] arr= {0,2,6,0,1,0,5,6,0,6,9,0,3,5,0,4,7,0};
		int temp=0;
		for(int i: arr) {
			System.out.print(i+" ");
		}
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==0) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j]!=0) {
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
						break;
					}
				}
			}
		}
		System.out.println();
		for(int i: arr) {
			System.out.print(i+" ");
		}
	
	//
	}
}
