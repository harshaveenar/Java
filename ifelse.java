import java.util.*;
class ifelse{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the Age: ");
int age=s.nextInt();
if (age>=18){
System.out.println("Eligible to Vote");
}
else{
System.out.println("Not Eligible to Vote");
}
}
}