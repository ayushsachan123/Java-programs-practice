package lecture5;
import java.util.Scanner;
public class Pattern6Tringular3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i,j,p;
		i = 1;
		while(i<=n) {
			p=i;
			j=1;
			while(j<=i)
			{
				System.out.print(p);
				p++;
				j++;
			}
			System.out.println();
			i++;
		}
	}

}

//----------------------------------------------------------------------------------------------------------------------------------------------------

// Input--
// 5
// Output--
// 1
// 23
// 345
// 4567
// 56789

