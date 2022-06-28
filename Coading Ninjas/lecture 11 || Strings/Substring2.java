package strings;
import java.util.Scanner;
public class Substring {
public static void Substrings(String str) {
	for(int i = 0;i<str.length();i++) {
		for(int j=i;j<str.length();j++) {
			System.out.println(str.substring(i,j+1));//j+1 because function is exclusive it does not
		}                                            //take last index.
	}
}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		Substrings(str);
	}
}


//--------------------------------------------------------------------------------------------------------------------------------------------------------
//Input
// abcd
// Output--
// a
// ab
// abc
// abcd
// b
// bc
// bcd
// c
// cd
// d
