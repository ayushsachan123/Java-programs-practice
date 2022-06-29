String buffer-- 

class HelloWorld {
    public static void main(String[] args) {
StringBuffer str  = new StringBuffer("abc");
str.setCharAt(0,'d');
str.append("def");
str.
System.out.println(str + " " + str.length());

}
}


//--------------------------------------------------------------------------------------------------------------------------------------------------------
Output--
abcdef 6
