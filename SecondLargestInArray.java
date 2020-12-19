public class SecondLargestInArray {
public static void main(String args[]) {
	int[] arr= {10000,10000,10000,10000};
	//better approach
	int l=0;
	int l2=-1;
	for(int i=1;i<arr.length;i++) {
		if(arr[i]>arr[l]) {
			l=i;
		}
	}
	for(int i=0;i<arr.length;i++) {
		if(i==l || arr[i]==arr[l]) {
			l2=l2+2;
			continue;
		}
		else if(arr[i]>arr[l2]) {
			l2=i;
		}
	}
	System.out.println("MAX AT  :"+l+"  2nd max at   :"+l2);
	System.out.println("VALUES ARE  :  "+arr[l]+"   "+arr[l2]);
	}
}

/*NAIVE
 * int res=0;
for(int i =1;i<arr.length;i++) {
	if(arr[i]>arr[res])
		res=i;
	
}
System.out.println("largest is at "+res);

int res2=-1;
for(int i=0;i<arr.length;i++) {
	if(arr[i]!=arr[res]) {
		if(res2 == -1)
			res2 =i;
		else if(arr[i]>arr[res2])
			res2=i;
	}
	
}
System.out.println("2nd largest is at "+res2);
*/