import java.util.*;
class pat1{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Rows: ");
int rows = sc.nextInt();
int coef = 1;
for(int i = 0; i < rows; i++) {
for(int space = 1; space < rows - i; ++space) {
System.out.println("  ");
}
for(int j = 0; j <= i; j++) {
if (j == 0 || i == 0){
coef = 1;
}
else{
coef = coef * (i - j + 1) / j;
}
System.out.println("%4d", coef);
}
System.out.println();
}
}
}