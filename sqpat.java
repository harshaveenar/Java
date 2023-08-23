import java.util.*;
class sqpat{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the Row: ");
int row=s.nextInt();
System.out.println("Enter the Column: ");
int col=s.nextInt();
for(int i=1;i<=row;i++){
for (int j=1;j<=col;j++){
System.out.print("*");
}
System.out.println();
}
}
}