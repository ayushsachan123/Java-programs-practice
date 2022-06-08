package lecture4;
import java.util.Scanner;
public class if_elseoddeven {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		if(a%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("Odd");
		}

	}

}

//--------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 10
// Output--
// even
	
