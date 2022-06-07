package lecture2;
import java.util.Scanner;

public class logical
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		boolean d = (a>=b) && (a>=c);
		System.out.println(d);
		
		boolean e = (a>=b) || (a>=c);
		System.out.println(e);
		
		System.out.println(!(a>=b));
		
		
	}

}

//--------------------------------------------------------------------------------------------------------------------------------------------------------
        //Input--
// 2 
// 3
// 4
	//Output--
// false
// false
// true

