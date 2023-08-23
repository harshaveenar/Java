import java.util.*;
class sums{
int a,b,c;
void add(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter A: ");
a=sc.nextInt();
System.out.println("Enter b: ");
b=sc.nextInt();
c=a+b;
System.out.println("Sum: "+c);
}
}
class cladd {
public static void main(String args[]){
sums d=new sums();
d.add();
}
}