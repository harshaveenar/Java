import java.util.*;
class stugrade{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the Student Mark: ");
int mark=s.nextInt();
if (mark>=90){
System.out.println("S Grade");
}
else if (mark>=80 && mark<90){
System.out.println("A Grade");
}
else if (mark>=80 && mark<90){
System.out.println("B Grade");
}
else if (mark>=70 && mark<80){
System.out.println("C Grade");
}
else if (mark>=60 && mark<70){
System.out.println("D Grade");
}
else if (mark>=50 && mark<60){
System.out.println("E Grade");
}
else {
System.out.println("Fail");
}
}
}