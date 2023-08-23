import java.util.*;
class arr2max{
public static void main(String args[]){
int x[]=new int[10];
int i;
int j;
int temp=0;
Scanner s=new Scanner(System.in);
System.out.print("Enter the Number of Elements: ");
int n=s.nextInt();
System.out.println("Enter the Element: ");
for(i=0;i<n;i++){
x[i]=s.nextInt();
}
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
System.out.println("2nd Maximum Element: "+x[n-2]);
}
}