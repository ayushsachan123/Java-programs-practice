package strings;
import java.util.Scanner;
public class Print_all_the_character_in_the_string {
public static void printChar(String str) {
	int n = str.length();
	for(int i=0;i<n;i++) {
		System.out.println(str.charAt(i));
	}
}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		printChar(str);
	}

}


//---------------------------------------------------------------------------------------------------------------------------------------------------------
//Input
// abcd efgh
// Output--
// a
// b
// c
// d
 
// e
// f
// g
// h
