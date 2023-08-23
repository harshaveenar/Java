import java.util.*;
class arr{
public static void main(String args[]){
int x[]=new int[10];
int i;
Scanner sc=new Scanner(System.in);
System.out.print("N: ");
int n=sc.nextInt();
System.out.println("Read the Numbers: ");
for(i=1;i<=n;i++){
x[i]=sc.nextInt();
}
System.out.println("Display the Numbers: ");
for(i=1;i<=n;i++){
System.out.println(x[i]);
}
}
}
