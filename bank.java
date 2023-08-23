import java.util.*;
class acc{
int dep,with,total;
int accno;
Scanner sc=new Scanner(System.in);
void display(){
System.out.println("Depositer Name: ");
String dname =sc.nextLine();
System.out.println("Type of Account: ");
String toa=sc.nextLine();
System.out.println("Account Number: ");
accno=sc.nextInt();
}
public void display1(){
System.out.println("Initial Amount: ");
int iniamt=sc.nextInt();
System.out.println("Deposited Amount: ");
dep=sc.nextInt();
total=iniamt+dep;
System.out.println("Total Amount: "+total);
}
public void display2(){
System.out.println("Withdrawn Amount: ");
with=sc.nextInt();
int t=total-with;
System.out.println("Balance Amount: "+t);
}
}
class bank{
public static void main(String args[]){
acc h=new acc();
h.display();
h.display1();
h.display2();
}
}