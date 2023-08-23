import java.io.*;
class statem{
public static void main(String args[]){
int x=5;
int y=7;
int z=-2;
System.out.println(x++);
System.out.println(y=(y--)-x);
System.out.println(z=x+y-(--z));
System.out.println(x+=5);
System.out.println(y/=5);
System.out.println(z%=10);
System.out.println(x++);
System.out.println(y--);
System.out.println(++z);
System.out.println(z=x+y);
System.out.println(x=y-z);
System.out.println(y=x*z);
System.out.println("X: "+x);
System.out.println("Y: "+y);
System.out.println("Z: "+z);
}
}

