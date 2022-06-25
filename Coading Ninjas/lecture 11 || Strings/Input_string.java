package strings;
import java.util.Scanner;
public class Input_String {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		String str1 = s.next();
		System.out.println(str1 + " " + str1.length());
		
		
		// if we use nextLine instead of next then we can print whole line
		// comment one and then rum another will work correctly
		
		
		String str2 = s.nextLine();
		System.out.println(str2 + " " + str2.length());
		
	}

}


//-------------------------------------------------------------------------------------------------------------------------------------------------------
//Input--
// abcd
// Output--
// abcd 4
//  0
