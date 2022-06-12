package lecture8;
import java.util.Scanner;

public class Primenumberbyfunction {
	public static boolean isprime(int n) {
int d= 2;
while(d<n) {
	if(n%d==0) {
return false;
	}
	d++;
	
}
return true;
}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		boolean ans = isprime(n);
		System.out.println(ans);
	}

}


//--------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 5
// Output--
// true
