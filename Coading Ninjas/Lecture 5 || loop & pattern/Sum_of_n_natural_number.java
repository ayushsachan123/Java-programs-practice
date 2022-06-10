package lecture5;
import java.util.Scanner;
public class Sum_of_n_natural_no {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum = 0;
		int i;
		for(i=1;i<=n;i++)
		{
			sum=sum+i;
			
		}
		System.out.println(sum);
	}

}


//--------------------------------------------------------------------------------------------------------------------------------------------------------

// Input--
// 5
// Output--
// 15
