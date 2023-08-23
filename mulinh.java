import java.io.*;
class A{
int x=10;
	void display(){
	System.out.println(x);
	}
}
interface B{
int y=10;
	public abstract void display1();
}
class C extends A implements B{
int z=0;
	void display2(){
		System.out.println(z);
	}
	public void display1()
	{
		System.out.println(y);
	}
}
class mulinh{
public static void main(String args[]){
C p=new C();
p.display();
p.display1();
p.display2();
}
}