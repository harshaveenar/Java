import java.util.*;
class arrsort{
public static void main(String args[]){
int x[]=new int[10];
int i;
int j;
int temp=0;
Scanner s=new Scanner(System.in);
System.out.print("N: ");
int n=s.nextInt();
System.out.println("Enter the Element: ");
for(i=0;i<n;i++){
x[i]=s.nextInt();
}
System.out.println("Sorted Element are");
for(i=0;i<n;i++){
for(j=0;j<n;j++){
if(x[i]<x[j])
{
temp=x[i];
x[i]=x[j];
x[j]=temp;
}
}
}
for(i=0;i<n;i++){
System.out.println(x[i]);
}
}
}