package arrays;
import java.util.Scanner;
public class Searchingofanumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int d=0;
		System.out.println("enter the number of element you want to print");
		int m = s.nextInt();
		System.out.println("enter the elements");
		int a[] = new int[8];
		for(int i=0;i<m;i++) {
			a[i] = s.nextInt();
		}
		int j = 0;
		int count = 0;
for(int i=0;i<n;i++) {
	
	if(a[i]==n) {
		 j = i;
		 count++;
		break;
	}
}
	if(count>=1)
	{
		System.out.println(j);
	}
	else 
	{
		System.out.println("Not exists");
	}
	


	}

}


//-----------------------------------------------------------------------------------------------------------------------------------------------------
//Output--
// 4
// enter the number of element you want to print
// 5
// enter the elements
// 3 6 8 9 2
// Not exists
