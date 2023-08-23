import java.util.*;
class bin2decoct{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);    
System.out.print("Enter a Binary Number : ");
int binary = sc.nextInt();
int r;
int decimal = 0;
int n = 0;  
while(binary > 0){
int temp = binary%10;  
decimal += temp*Math.pow(2, n);  
binary = binary/10;  
n++;  
}
System.out.println("Decimal Number : "+decimal);
int octal[] = new int[20];
int i = 0;
while(decimal > 0)
{
r = decimal % 8;
octal[i++] = r;
decimal = decimal / 8;
}

System.out.print("Octal Number : ");
for(int j = i-1 ; j >= 0 ; j--)
System.out.print(octal[j]); 
}
}