package strings;
import java.util.Scanner;
public class Substring_Approch2 {
	public static void Substring(String str) {
		for(int len=1;len<=str.length();len++) {
			for(int start=0;start<=str.length()-len;start++) {
				int end = start+len-1;
				System.out.println(str.substring(start,end+1));
				}
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		Substring(str);

	}

}


//-------------------------------------------------------------------------------------------------------------------------------------------------------
//Input--
// abcd
// Output--
// a
// b
// c
// d
// ab
// bc
// cd
// abc
// bcd
// abcd
