package lecture6;
import java.util.Scanner;
public class Pattern3invertedtriangle {

	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int i,j,k;
     i = 1;
     while(i<=n) {
    	 j=1;
    	 while(j<=n-i+1) {
    		 System.out.print("*");
    		 j++;
    	 }
    	 System.out.println();
    	i++;
     }
	}

}


//--------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 5
// Output--
// *****
// ****
// ***
// **
// *

