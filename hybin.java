import java.io.*;
class sports{
int x=10;
	void display(){
	System.out.println(x);
	}
}
interface test{
	int y=10;
	public abstract void display2();
}
class result extends acdemic implements test{
	int z=0;
	void display3(){
	System.out.println(z);
	}
public void display2(){
System.out.println(y);
}
}
class hybin{
public static void main(String args[]){
result h=new result();
h.display();
h.display2();
h.display3();
}
}