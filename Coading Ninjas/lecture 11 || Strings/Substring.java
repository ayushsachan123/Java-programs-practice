package strings;

public class Substring_function {

	public static void main(String[] args) {
		String str1 = "Coding";
		//Substring of the String
		
		System.out.println(str1.substring(0));//here we can put 0,1 till length of array it will 
		                                      //give the character the index we have write onwards
		System.out.println(str1.substring(2));
		
		// if we put 6 then
		String str2 = str1.substring(6);
		System.out.println(str2.length());
		
		//we can also pass start index as well as end index
		String str3 = str1.substring(1,3);
		System.out.println(str3);
		
	}

}


//------------------------------------------------------------------------------------------------------------------------------------------------------
// Output--
// Coding
// ding
// 0
// od

