import java.*;
class details{
Scanner sc=new Scanner(System.in);
void display(){
System.out.println("Name: ");
String n=sc.nextLine();
System.out.println("Register Number: ");
int reg=sc.nextInt();
}
}
class marks extends details{
void display1(){
System.out.println("M1: ");
int m1=sc.nextInt();
System.out.println("M2: ");
int m2=sc.nextInt();
System.out.println("M3: ");
int m3=sc.nextInt();
}
}
interface extra{
int y=10;
public abstract void display2();
}
class grade extends marks implements extra{
void display3(){
if(m1<50 || m2<50 || m3<50 ){
System.out.println("Not Eligible"); 
}
else{
int total=m1+m2+m3;
int avg=m1+m2+m3/3;
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
void display2(){
System.out.println(y);
}
}
}
class inheri{
public static void main(String args[]){
grade g=new grade();
g.display();
g.display1();
g.display2();
g.display3();
}
}