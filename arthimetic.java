import java.util.*;
class sums{
int a,b,add,sub,mul,div,mod;
void arthi(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter A: ");
a=sc.nextInt();
System.out.println("Enter b: ");
b=sc.nextInt();
add=a+b;
System.out.println("Sum: "+add);
sub=a-b;
System.out.println("Subraction: "+sub);
mul=a*b;
System.out.println("Multiplication: "+mul);
div=a/b;
System.out.println("Division: "+div);
mod=a%b;
System.out.println("Modulus: "+mod);
}
}
class arthimetic{
public static void main(String args[]){
sums d=new sums();
d.arthi();
}
}