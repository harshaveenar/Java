import java.util.*;
class p{
Scanner sc = new Scanner(System.in);  
void display(){
System.out.println("Enter the number: ");  
int num=sc.nextInt();
int r,sum=0;
int temp=num;    
while(num>0)
{    
r=num%10;    
sum=(sum*10)+r;    
num=num/10;    
}    
if(temp==sum){  
System.out.println("The entered number "+temp+" is a palindrome number ");   
} 
else{    
System.out.println("The entered number "+temp+" is not a palindrome"); 
}  
}
}
class palinnum
{  
public static void main(String args[]) 
{  
p g=new p();
g.display();
}  
} 
