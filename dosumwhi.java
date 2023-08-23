import java.util.*;
class dosumwhi{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter N: ");
int n=sc.nextInt();
int i=1;
int s=0;
do{
s=s+i;
i=i+1;
}
while(i<=n);
System.out.println("Sum of N Natural Numbers are: "+s);
}
}