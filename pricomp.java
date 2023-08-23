import java.util.Scanner;
class pricomp{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Any Number: ");
int input_num = sc.nextInt();
int i=2;
while(input_num>0){
if(input_num%i==0)
break;
i++;
}
if(input_num == i){
System.out.println("Number is Prime Number");
}
else{
System.out.println("Number is a Composite NUmber");
}
}
}