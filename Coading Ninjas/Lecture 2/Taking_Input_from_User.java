package lecture2;

import java.util.Scanner;
public class takinginputfromuser {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt();
		int j = scan.nextInt();
		int k = i+j;
		
		System.out.println(k);
		
		
		Scanner s= new Scanner(System.in);
		
		int p = s.nextInt();
		int r = s.nextInt();
		int t = s.nextInt();
		int si = (p*r*t)/100;
		
		System.out.println(si);
		
		
		
	}

}

//--------------------------------------------------------------------------------------------------------------------------------------------------------
//Input--
// 100
// 200
//Output--
// 300

//Input--
// 100
// 150
// 200
//Output--
// 30000

