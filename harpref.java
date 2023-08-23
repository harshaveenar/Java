import java.util.*;
class harpref{
public static void main(String args[]){
int r, n, num,
sum = 0;
Scanner sc = new Scanner(System.in);
System.out.print("Enter number: ");
n = sc.nextInt();
num = n;
while (num > 0)
{
r = num % 10;
sum = sum + r;
num = num / 10;
}
if (n % sum == 0)
{
System.out.println("It is a Harshad Number");
}
else
{
System.out.println("It is a Prefect Number");
}
}
}
