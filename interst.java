import java.util.*;
class inter{
void sim(){
float simin;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Pricipal: ");
float p=sc.nextFloat();
System.out.println("Enter the time: ");
float t=sc.nextFloat();
System.out.println("Enter the Rate: ");
float r=sc.nextFloat();
int a=sc.nextInt();
switch(a)
{
case 1:
System.out.println("Senior Citizen: "+((p*t*r)/100*(0.12)));
break;
case 2:
System.out.println("Other Citizen: "+((p*t*r)/100*(0.10)));
break;
default:
System.out.println("Invalid Input");
}
}
void com(){
float comin;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Pricipal: ");
float pr=sc.nextFloat();
System.out.println("Enter the time: ");
float ti=sc.nextFloat();
System.out.println("Enter the Rate: ");
float ra=sc.nextFloat();
System.out.println("Enter Citizenship: ");
int b=sc.nextInt();
switch(b)
{
case 1:
System.out.println("Senior Citizen: "+((pr*(1+ra/100)-pr*(0.12))));
break;
case 2:
System.out.println("Other Citizen: "+((pr*((1+ra/100))-pr*(0.10))));
break;
default:
System.out.println("Invalid Input");
}
}
}
class interst{
public static void main(String args[]){
inter in=new inter();
in.sim();
in.com();
}
}
