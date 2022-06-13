package lecture6;
import java.util.Scanner;
public class Pattern6 {

	public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   int n = s.nextInt();
   int i,j,k,l,p;
   i = 1;
   while(i<=n) {
	   j=1;
	   while(j<=n-i) {
		   System.out.print(' ');
		   j++;
	   }
	   k = 1;
	   p=i;
	   while(k<=i) {
		   System.out.print(p);
		   p++;
		   k++;
	   }
	   l = 1;
	   int q = 2*i-2;
	   while(l<=i-1) {
		   System.out.print(q);
		   q--;
		   l++;
	   }
	   System.out.println();
	   i++;
   }
	}

}


//-------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Input-
// 5
// Output--
//     1
//    232
//   34543
//  4567654
// 567898765


