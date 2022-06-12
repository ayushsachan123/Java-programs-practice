package lecture8;
import java.util.Scanner;
public class Prime2toN {
	public static boolean isprime(int n) {
		int d=2;
		while(d<n) {
			if(n % d ==0) {
				return false;
			}
			d++;
		}
		return true;
	}
	public static void primeno(int n) {
		for(int i=2;i<=n;i++) {
			boolean isIprime = isprime(i);
			if(isIprime== true) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	primeno(n);
	}

}

//--------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 5
// Output--
// 2
// 3
// 5

