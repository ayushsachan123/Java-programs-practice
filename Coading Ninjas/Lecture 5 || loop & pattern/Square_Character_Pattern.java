package lecture5;
import java.util.Scanner;
public class Pattern7Character1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
	    int i,j;
	    i = 1;
	    while(i<=n) {
	    	j = 1;
	    	while(j<=n){
	    		char alpha = (char)('A'+j-1);
	    		System.out.print(alpha);
	    		j++;
	    	}
	    	System.out.println();
	    	i++;
	    }

	}

}


// ----------------------------------------------------------------------------------------------------------------------------------------------------------
// Output--

// 5
// ABCDE
// ABCDE
// ABCDE
// ABCDE
// ABCDE
