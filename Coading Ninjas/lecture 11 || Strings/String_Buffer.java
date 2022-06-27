package strings;
import java.util.Scanner;
public class StringBuffer {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	String str = s.next();
	for(int i=0;i<4;i++) {
		str = str+ 'z';
	}
System.out.println(str);
	}

}


//-------------------------------------------------------------------------------------------------------------------------------------------------------
//Input--
// abc
// Output--
// abczzzz
