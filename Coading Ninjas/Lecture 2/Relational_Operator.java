package lecture2;
import java.util.Scanner;
public class relational {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		int j = s.nextInt();
		boolean a = (i==j);
		System.out.println(a);
	}

}

//--------------------------------------------------------------------------------------------------------------------------------------------------------
//Input--   |
// 3        |3
// 3        |4
//Output--  |
// true     |false

