import java.util.*;
class repcard{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Register Number: ");
int reg=s.nextInt();
System.out.println("Name: ");
String name=s.nextLine();
System.out.println("Mark1: ");
int m1=s.nextInt();
System.out.println("Mark2: ");
int m2=s.nextInt();
System.out.println("Mark3: ");
int m3=s.nextInt();
System.out.println("Mark4: ");
int m4=s.nextInt();
System.out.println("Mark5: ");
int m5=s.nextInt();
if(m1<50 || m2<50 || m3<50 || m4<50 || m5<50){
System.out.println("Not Eligible"); 
}
else{
int total=m1+m2+m3+m4+m5;
int avg=m1+m2+m3+m4+m5/5;
if (avg>=90){
System.out.println("S Grade");
}
else if (avg>=80 && avg<90){
System.out.println("A Grade");
}
else if (avg>=80 && avg<90){
System.out.println("B Grade");
}
else if (avg>=70 && avg<80){
System.out.println("C Grade");
}
else if (avg>=60 && avg<70){
System.out.println("D Grade");
}
else if (avg>=50 && avg<60){
System.out.println("E Grade");
}
else {
System.out.println("Fail");
}
}
}
}