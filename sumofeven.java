import java.util.*;
class sumofeven{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter N: ");
int n=sc.nextInt();
int i=1;
int s=0;
while(i<=n){
s=s+i;
i=i+2;
}
System.out.println("Sum of Even Numbers are: "+s);
}
}