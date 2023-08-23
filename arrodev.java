import java.util.*;
class arrodev{
public static void main(String args[]){
int x[]=new int[10];
int i;
int even=0;
int odd=0;
Scanner sc=new Scanner(System.in);
System.out.print("N: ");
int n=sc.nextInt();
System.out.println("Numbers: ");
for(i=1;i<=n;i++){
x[i]=sc.nextInt();

if(x[i]%2==0){
even=even+x[i];
}
else{
odd=odd+x[i];
}
}
System.out.println("Even: "+even);
System.out.println("Odd: "+odd);
}
}