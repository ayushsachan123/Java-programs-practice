package lecture2;
import java.util.Scanner;
public class farenhiettocelcius {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int f = s.nextInt();
		//int cel = (5/9)*(f-32); wrong because 5/9 = 0 so 0*something = 0
		
		int cel = (5*(f-32))/9;
		System.out.println(cel);
		
		int c = (int)((5.0/9)*(f-32));
		System.out.println(c);

		char d = 'a';
		char e = (char)(d + 10);
		System.out.println(e);
	}

}

//---------------------------------------------------------------------------------------------------------------------------------------------------------
//Output--
// 300
// 148
// 148
// k
