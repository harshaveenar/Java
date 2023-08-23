import java.uitil.*;
class atm{
public static void main(String args[]){
int a=2000;
int b=500;
int c=200;
int d=100;
Scanner s=new Scanner(System.in);
System.out.println("Enter the 1st Denomination number of notes");
int a1=s.nextInt();
System.out.println("Enter the 2nd Denomination number of notes");
int b1=s.nextInt();
System.out.println("Enter the 3rd Denomination number of notes");
int c1=s.nextInt();
System.out.println("Enter the 4th Denomination number of notes");
int d1=s.nextInt();
int x=((a*a1)+(b*b1)+(c*c1)+(d*d1))
System.out.println("Total Available Balance in ATM:" +x);
}
}
