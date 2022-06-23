package strings;
import java.util.Scanner;
public class Checkpalindrome1 {
public static boolean checkpalindrome(String str) {
	int i=0;
	int j= str.length()-1;
	while(i<j) {
		if(str.charAt(i)!=str.charAt(j)) {
			return false;
		}
		i++;
		j--;
	}
	return true;
}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		boolean palindrome =checkpalindrome(str);
		System.out.println(palindrome);

	}

}


//--------------------------------------------------------------------------------------------------------------------------------------------------------
//Input--
// abba
// Output--
// true
