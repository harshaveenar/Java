import java.io.*;
class ignoreto{
public static void main(String args[]){
String str1="This is a Java Program";
String str2="this is a java progra";
int s=str1.compareToIgnoreCase(str2);
if(s==0){
System.out.println(str1+" is equal to "+str2);
}
}
}