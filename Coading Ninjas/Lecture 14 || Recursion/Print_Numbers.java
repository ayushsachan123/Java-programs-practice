package Recursion_1;
import java.util.Scanner;
public class Print_number {
	public static void number(int n) {
		if(n==1) {
			System.out.println(1 + " ");
			return;
		}
		number(n-1);
		System.out.println(n);
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		number(n);

	}

}


//--------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 5
// Output--
// 1 
// 2
// 3
// 4
// 5
