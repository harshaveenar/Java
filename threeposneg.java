import java.util.*;
class threeposneg{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the Number: ");
int num=s.nextInt();
if (num>0){
System.out.println("Positive Numbers");
}
else if(num==0){
System.out.println("Zero");
}
else{
System.out.println("Negative Numbers");
}
}
}