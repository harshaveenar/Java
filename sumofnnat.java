import java.util.*;
class sumofnnat{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter N: ");
int n=sc.nextInt();
int i=1;
int s=0;
while(i<=n){
s=s+i;
i=i+1;
}
System.out.println("Sum of N Natural Numbers are: "+s);
}
}