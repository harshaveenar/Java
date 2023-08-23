import java.util.*;
class forodev{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter N: ");
int n=sc.nextInt();
int s=0;
int e=0;
for(int i=1;i<=n;i=i+2)
{
s=s+i;
}
System.out.println("Sum of Odd Numbers are: "+s);
for(int j=2;j<=n;j=j+2)
{
e=e+j;
}
System.out.println("Sum of Even Numbers are: "+e);
}
}