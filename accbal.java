import java.util.*;
class acc{
void cal(){
int c;
int am=10000;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Amount Deposited: ");
int ad=sc.nextInt();
System.out.println("Enter the Amount Withdrawn: ");
int aw=sc.nextInt();
c=(am+ad)-aw;
System.out.println("Balance Amount in the Account: "+c);
}
}
class accbal{
public static void main(String args[]){
acc s=new acc();
s.cal();
}
}