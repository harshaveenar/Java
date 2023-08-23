import java.io.*;
class replacestr{
public static void main(String[] args){
String str = "The quick brown fox jumps over the lazy dog.";
String str1 = str.replaceAll("fox", "cat");
System.out.println("Given String: " +str);
System.out.println("Replaced String: " +str1);
}
}
