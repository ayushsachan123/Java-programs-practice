package arrays;

public class Primitive_nonprimitive {
//public static void increment(int i) {
//	i++;
//}
public static void printoutput(int[] arr) {
	int n = arr.length;   
	for(int i=0;i<n;i++) {
		System.out.println(arr[i]);
	}
}
public static void incrementarray(int[] input) {
	for(int i=0;i<input.length;i++) {
		input[i]= input[i]+1;
	}
}
	public static void main(String[] args) {
//		int i=10;
//		increment(i);
//		System.out.println(i);//pass by value for primitive data type
		int[] arr= {1,2,3,4,5};
		incrementarray(arr);
		printoutput(arr);
	}

}


//--------------------------------------------------------------------------------------------------------------------------------------------------------
// Output--
// 2
// 3
// 4
// 5
// 6
