import java.io.*;
class A{
int x=10;
void display(){
System.out.println(x);
}
}
class B extends A{
int y=20;
void display1(){
System.out.println(y);
}
}
class methoverride{
public static void main(String args[]){
B b=new B();
b.display();
b.display1();
}
}