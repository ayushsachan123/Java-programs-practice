package strings;
import java.util.Scanner;
public class Basic2_String {

	public static void main(String[] args) {
		String str1 = "coading";
		String str2 = " is fun";
		str1+=str2;  // it will also add to string
		
		System.out.println(str1);
		System.out.println("Concatenation of string " + str1 +str2);//adding to string
		
		
		String str3 = "ayush";
		String str4 = " sachan";
		
		str3=str3.concat(str4);  //it will also concatinate two string
		System.out.println(str3);

	}

}


//--------------------------------------------------------------------------------------------------------------------------------------------------------
//Output--
// coading is fun
// Concatenation of string coading is fun is fun
// ayush sachan
