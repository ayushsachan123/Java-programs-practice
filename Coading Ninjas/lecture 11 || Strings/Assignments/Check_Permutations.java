package Assignments;
import java.util.Scanner;
public class Check_Permutation {
public static boolean CheckPermutation(String str1,String str2) {
	int m = str1.length();
	int n = str2.length();
	if(n!=m) {
		return false;
	}
	int frequency[] = new int[256];
	for(int i=0;i<256;i++) {
		frequency[i]=0;
	}
	for(int i=0;i<m;i++) {
	 char ch = str1.charAt(i);
	 frequency[ch]++;
	}
	for(int i=0;i<n;i++) {
		 char ch = str2.charAt(i);
		 frequency[ch]--;
		}
	for(int i=0;i<256;i++) {
		if(frequency[i]!=0) {
			return false;
		}
	}
	return true;
}
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		String str1 = s.next();
		String str2 = s.next();
		 boolean a = CheckPermutation(str1,str2);
         System.out.println(a);
	}

}


//-----------------------------------------------------------------------------------------------------------------------------------------------------
//Input--
// abcd
// efgh
// Output--
// false
