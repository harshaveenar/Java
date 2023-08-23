import java.util.*;
class leapyr{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the Year: ");
int yr=s.nextInt();
if (yr%4==0){
System.out.println("It is a Leap Year");
}
else{
int N=yr%4;
System.out.println("It is not a Leap Year");
System.out.println("Remaining Years: "+(yr+(4-N)));
}
}
}