package strings;
import java.util.Scanner;
public class Count_words {

	public static void countarray(String str) {
		int n = str.length();
		int space =0;
		for(int i=0;i<n;i++) {
			if(str.charAt(i)==' ') {
				space++;
			}
		}
		System.out.println(space);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		countarray(str);
	}

}


//-------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// abc
// Output--
// 0
  
