package strings;
import java.util.Scanner;
public class Reverse_each_word {
public static String reverseword(String str) {
	String ans ="";
	int currentwordstart = 0;
	int i;
	for(i=0;i<str.length();i++) {
		if(str.charAt(i)== ' ') {
			//reverse current word 
			//add to the final string
			int currentword = i-1;
			String reversedword ="";
			for(int j =currentwordstart;j<=currentword;j++) {
				reversedword = str.charAt(j) + reversedword;
			}
			ans += reversedword + " ";
			currentwordstart = i+1;
		}
	}
	int currentword = i-1;
	String reversedword ="";
	for(int j =currentwordstart;j<=currentword;j++) {
		reversedword = str.charAt(j) + reversedword;
	}
	ans += reversedword;
	return ans;
}
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String str = s.nextLine();
	String a =reverseword(str);
System.out.println(a);
	}

}


//------------------------------------------------------------------------------------------------------------------------------------------------------
//Input--
// abcd efgh
// Output--
// dcba hgfe
