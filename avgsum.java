import java.util.*;
class avgsum{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter N1: ");
int n1=s.nextInt();
System.out.println("Enter N2: ");
int n2=s.nextInt();
System.out.println("Enter N3: ");
int n3=s.nextInt();
System.out.println("Enter N4: ");
int n4=s.nextInt();
System.out.println("Enter N5: ");
int n5=s.nextInt();
int n6=n1+n2+n3+n4+n5;
System.out.println("Sum: "+n6);
System.out.println("Average: "+(n6/5));
}
}
