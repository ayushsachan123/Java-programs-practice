package lecture5;
import java.util.Scanner;
public class Pattern5Tringular2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i,j,p;
		p=1;
		i = 1;
		while(i<=n) {
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

//-------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 5
// Output--
// 1
// 23
// 456
// 78910
// 1112131415
