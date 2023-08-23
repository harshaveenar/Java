import java.util.*;
class ebbill{
public static void main(String []args){
Scanner s=new Scanner(System.in);
System.out.println("Consumer Number: ");
int cn=s.nextInt();
System.out.println("Consumer Name: ");
String cna=s.nextLine();
System.out.println("Current Month Reading: ");
float cm=s.nextFloat();
System.out.println("Last Month Reading: ");
float lm=s.nextFloat();
float unit=cm-lm;
float b;
System.out.println("Number: ");
int n=s.nextInt();
switch(n){
case 1:
System.out.println("Domestic Bill");
if(unit<=100) {
System.out.println("Bill Amount: "+(unit*0));
}
else if(unit<=200){
System.out.println("Bill Amount: "+(100*0+(unit-100)*1.40));
}
else if(unit<=300){
System.out.println("Bill Amount: "+(100*0+100*1.40+(unit-100)*2.60));
}
else if(unit<=500){
System.out.println("Bill Amount: "+(100*0+100*1.40+100*2.60+(unit-100)*4.00));
}
else{
System.out.println("Bill Amount: "+(100*0+100*1.40+100*2.60+100*4.00+(unit-100)*7.00));
}
break;
case 2:
System.out.println("Industrial Bill");
if(unit<=100) {
System.out.println("Bill Amount: "+(unit*2.00));
}
else if(unit<=200){
System.out.println("Bill Amount: "+(100*2.00+(unit-100)*2.70));
}
else if(unit<=300){
System.out.println("Bill Amount: "+(100*2.00+100*2.70+(unit-100)*3.70));
}
else if(unit<=500){
System.out.println("Bill Amount: "+(100*2.00+100*2.70+100*3.70+(unit-100)*3.75));
}
else{
System.out.println("Bill Amount: "+(100*2.00+100*2.70+100*3.70+100*3.75+(unit-100)*11));
}
break;
default:
System.out.println("Invalid Input");
}
}
}
