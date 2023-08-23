import java.util.Scanner;
public class fuzzbizz{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter the size of the array: ");
int n = input.nextInt();
String[] answer = new String[n];
for (int i = 1; i <= n; i++) {
if (i % 3 == 0 && i % 5 == 0) {
answer[i-1] = "FuzzBizz";
} 
else if (i % 3 == 0) {
answer[i-1] = "Fuzz";
} 
else if (i % 5 == 0) {
answer[i-1] = "Bizz";
} 
else {
answer[i-1] = String.valueOf(i);
}
}
System.out.println("The FuzzBizz array is:");
for (String s : answer) {
System.out.print(s + " ");
}
}
}
