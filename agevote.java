import java.util.*;
class agevote{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the Age: ");
int age=s.nextInt();
if (age>=18){
System.out.println("Eligible to Vote");
}
else{
System.out.println("Not Eligible to Vote");
System.out.println("Remaining Age to Vote: "+(18-age));
}
}
}