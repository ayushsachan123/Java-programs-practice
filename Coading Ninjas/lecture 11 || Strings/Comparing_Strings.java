package strings;
import java.util.Scanner;
public class Compairing_String {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		if(str1 == str2) {
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
		}
		if(str1 == str3) {
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
		}
	}

}


//--------------------------------------------------------------------------------------------------------------------------------------------------------
// Output--
// equal
// not equal
