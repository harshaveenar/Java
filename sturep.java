import java.util.*;
class stu{
int reg_no,m1,m2,m3,m4,m5,total,avg;
void report(){
Scanner sc=new Scanner(System.in);
System.out.println("Name: ");
String name=sc.nextLine();
System.out.print("Register Number: ");
reg_no=sc.nextInt();
System.out.print("Mark 1: ");
m1=sc.nextInt();
System.out.print("Mark 2: ");
m2=sc.nextInt();
System.out.print("Mark 3: ");
m3=sc.nextInt();
System.out.print("Mark 4: ");
m4=sc.nextInt();
System.out.print("Mark 5: ");
m5=sc.nextInt();
total=m1+m2+m3+m4+m5;
avg=total/5;
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
class sturep{
public static void main(String args[]){
stu st=new stu();
st.report();
}
}