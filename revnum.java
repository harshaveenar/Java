import java.util.*;
class revnum{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the Number: ");
int n=s.nextInt();
int b=0;
while(n != 0){
int temp=n%10;
b=b*10+temp;
n/=10;
}
System.out.println("Reverse Number: "+b);
}
}