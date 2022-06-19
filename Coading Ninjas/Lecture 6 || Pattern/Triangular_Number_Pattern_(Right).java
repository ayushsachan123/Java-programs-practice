package lecture6;
import java.util.Scanner;
blic class pattern2number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i,j,k;
		i=1;
		while(i<=n) {
			j=1;
			while(j<=(n-i)) {
				System.out.print(' ');
				j++;
			}
			k=1;
			while(k<=i) {
				System.out.print(k);
				k++;
			}
			i++;
			System.out.println();
		}

	}

}


//------------------------------------------------------------------------------------------------------------------------------------------------------
//Input--
//5
//Output--
//    1
//   12
//  123
// 1234
//12345


