import java.util.*;
class firlas{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter N: ");
int n=sc.nextInt();
int temp,rem,fri=0;
temp=n%10;
while(n != 0){
rem=n%10;
fri=fri*10+rem;
n/=10;
}
System.out.println("1st Digit: "+fri%10);
System.out.println("Last Digit: "+temp);
}
}