import java.io.*;
class A{
int x=10;
void diaplay(){
System.out.println(x);
}
}
interface B{
int y=10;
void diaplay1();
}
class C extends A implements B{
int z=0;
void display2(){
System.out.println(z);
}
void display1(){
System.out.println(y);
}
}
class mulinh{
public static void main(String args[]){
c n=new c;
n.display1();
n.display2();
}
}