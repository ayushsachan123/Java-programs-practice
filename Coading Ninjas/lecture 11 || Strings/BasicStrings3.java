package strings;
import java.util.Scanner;
public class Basic_String3 {

	public static void main(String[] args) {
		String str1 = "ayush";
		String str2 = "sachan";
		String str3 = "ayush";
		//comparing two string
		System.out.println(str1.equals(str2));
		
		System.out.println(str1.equals(str3));
		
		System.out.println(str1.compareTo(str2));
		
		//cotains function tells the first string cotains the second string or not
		//it will return true or false
		System.out.println(str1.contains("ush"));
		System.out.println(str1.contains("co"));
	}

}


//-------------------------------------------------------------------------------------------------------------------------------------------------------
//Output--
// false
// true
// -18
// true
// false
