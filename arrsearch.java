import java.util.*;
class arrsearch{
public static void main(String args[]){
int x[]=new int[10];
int i;
int k=0;
Scanner sc=new Scanner(System.in);
System.out.print("N: ");
int n=sc.nextInt();
System.out.println("Enter the Element to be Searched: ");
int se=sc.nextInt();
System.out.println("Numbers: ");
for(i=1;i<=n;i++){
x[i]=sc.nextInt();
}
for(i=1;i<=n;i++){
if(x[i]==se){
k=k+1;
}
}
if(k>=1){
System.out.println("Element is Present");
}
else{
System.out.println("Element is not Present");
}
}
}
