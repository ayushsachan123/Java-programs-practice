package strings;
import java.util.Scanner;
public class Reverse_string {
public static String reverseString(String str) {
	String reversedString = "";
	for(int i=str.length()-1;i>=0;i--) {
		reversedString+=str.charAt(i);
	}
	return reversedString;
}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
String str = s.nextLine();
String reversestring = reverseString(str);
System.out.println(reversestring);
	}

}


//--------------------------------------------------------------------------------------------------------------------------------------------------------
//Input--
// abcd efgh
// Output--
// hgfe dcba
