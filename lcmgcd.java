import java.util.*;
class lcmgcd{
public static void main(String args[]){
int t;
Scanner s=new Scanner(System.in);
System.out.println("Enter A: ");
int a=s.nextInt();
System.out.println("Enter B: ");
int b=s.nextInt();
int atemp = a;
int btemp = b;
while(btemp != 0){
t=btemp;
btemp=atemp%btemp;
atemp= t;
}
int gcd = atemp;
int lcm=(a*b)/gcd;
System.out.println("LCM: "+lcm);
System.out.println("GCD: "+gcd);
}
}