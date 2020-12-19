
public class Palindromic {
	public static boolean find(String s) {
		int low=0;
		int high=s.length()-1;
		boolean flag=false;
		while(low<=high) {
			if(s.charAt(low)==s.charAt(high)) {
				flag=true;
				low++;
				high--;
			}
			else {
				flag=false;
				break;
			}
		}
		return flag;
		
	}
	public static void main (String args[]) {
		String str="abbaccccabba";
		boolean result=find(str);
		if(result==true) {
			System.out.println("PALINDROME");
		}
		else {
			System.out.println("NOT");
		}
	}
}
