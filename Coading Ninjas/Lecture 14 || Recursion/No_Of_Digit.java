package Recursion_1;
import java.util.Scanner;
public class Number_of_Digit {
	public static int Digit(int n) {
		if((n/10)==0) {
			return 1;
		}
		int count = Digit(n/10);
		return count+1;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int ans = Digit(n);	
		System.out.println(ans);

	}

}


//-------------------------------------------------------------------------------------------------------------------------------------------------------
//Input--
// 10
// Output--
// 2
