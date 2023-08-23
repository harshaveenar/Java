import java.util.*;
class num{
void small(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter A value: ");
int a=sc.nextInt();
System.out.println("Enter B value: ");
int b=sc.nextInt();
System.out.println("Enter C value: ");
int c=sc.nextInt();
if (a<b && a<c){
System.out.println("A is Smallest than B and C");
}
else if (b<a && b<c){
System.out.println("B is Smallest than A and C");
}
else{
System.out.println("C is Smallest than A and B");
}
}
}
class smlnum{
public static void main(String args[]){
num n=new num();
n.small();
}
}