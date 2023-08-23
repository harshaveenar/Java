import java.util.*;
class tax{
public static void main(String []args){
int t=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter the Employee Income: ");
int in=s.nextInt();
if(in<500000){
System.out.println("No Tax");
}
else if(in>=500000 && in<1000000){
System.out.println("Tax: "+(0.1 *in));
}
else if(in>=1000000 && in<2000000){
System.out.println("Tax: "+(0.15*in));
}
else if(in>=2000000 && in<3000000){
System.out.println("Tax: "+(0.2*in));
}
else{
System.out.println("Tax: "+(0.3*in));
}
}
}
