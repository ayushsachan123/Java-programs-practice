package Assignments;
import java.util.Scanner;
public class Remove_Consecutive_Duplicates {
	public static String consecutive(String str1) {
		int m = str1.length();
		int i = 0;
		String str2 ="";
		while(i<m) {
			char a = str1.charAt(i);
			int b = i+1;
		while(b<m && str1.charAt(b)==a ) {
			b++;
		}
		str2+=a;
		i = b;
		}
		return str2;
	}
		
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		String str1 = s.next();
	    String str2 = consecutive(str1);
         System.out.println(str2);
	}

}


//-------------------------------------------------------------------------------------------------------------------------------------------------------
//Input--
// aabbc
// Output--
// abc
