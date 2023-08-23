import java.util.*;
class step{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number: ");
int n=sc.nextInt();
while(n>1)
{
if (n%2==0){
n=n/2;
System.out.println(n/2);
}
else{
n=n-1;
System.out.println(n-1);
}
}
System.out.println("Remaining 0");
}
}