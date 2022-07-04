package Recursion_1;
import java.util.Scanner;
public class Fibonacci_Number {
	public static int fib(int n) {
		if(n==0) {
			return 0;
		}
		else if(n==1) {
			return 1;
		}
	  return fib(n-1)+fib(n-2);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int ans = fib(n);	
		System.out.println(ans);
	}

}


//--------------------------------------------------------------------------------------------------------------------------------------------------------
//Input--
// 6
// Output--
// 8
