package strings;
import java.util.Scanner;
public class Palindrome {
public static boolean palindrome(String str) {
	int i=0;
	int j= str.length()-1;
	while(i<j) {
		if(str.charAt(i)!=str.charAt(j)) {
			return false;
		}
		else {
			i++;
			j--;
		}
	}
		return true;
}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean result;
		String str = s.next(); 
		result = palindrome(str);
		System.out.println(result);
	}

}


//--------------------------------------------------------------------------------------------------------------------------------------------------------
//Input--
// abcd
// Output--
// false
