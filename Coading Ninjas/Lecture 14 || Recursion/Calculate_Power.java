package Recursion_1;
import java.util.Scanner;
public class Calculate_power {
	public static int power(int n, int m) {
		if(m==1) {
			return n;
		}
		return n*power(n,m-1);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int m = s.nextInt();
		int ans = power(n,m);
		System.out.println(ans);

	}

}


//--------------------------------------------------------------------------------------------------------------------------------------------------------
//Input--
// 3 4
// Output--
// 81
