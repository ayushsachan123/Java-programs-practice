package strings;
import java.util.Scanner;
public class Check_palidrome {
	public static void reverseString(String str) {
	String reversedString = "";
	for(int i=str.length()-1;i>=0;i--) {
		reversedString+=str.charAt(i);
	}
	if(reversedString.equals(str)) {
		System.out.println("palidrome");
	}
	else {
		System.out.println("not Palidrome");
	}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		reverseString(str);
	}
}


//--------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// abba
// Output--
// palidrome
