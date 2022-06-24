package strings;
import java.util.Scanner;
public class Compare_elements_of_two_Strings {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
String str1 = "abc";
String str2 = "abc";
String str3 = new String("abc");
if(str1.equals(str3)) {
	System.out.println("equals");
}
else {
	System.out.println("Not equals");
}
	}

}


//--------------------------------------------------------------------------------------------------------------------------------------------------------
// Output--
// equals
