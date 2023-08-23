import java.util.*;
class sumarr{
public static void main(String args[]){
int x[]=new int[10];
int i;
Scanner sc=new Scanner(System.in);
System.out.print("N: ");
int n=sc.nextInt();
System.out.println("Numbers: ");
for(i=0;i<n;i=i+1){
x[i]=sc.nextInt();
}
int sum=x[0]+(x[n-1]);
int diff=x[0]-(x[n-1]);
System.out.println("Sum: "+sum);
System.out.println("Difference: "+diff);
}
}

