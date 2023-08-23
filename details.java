import java.util.*;
class details{
public static void main(String args[]){
Scanner det = new Scanner(System.in);
System.out.println("Name: ");
String name=det.nextLine();
System.out.println("Father Name: ");
String fname= det.nextLine();
System.out.println("Door Number: ");
int dr=det.nextInt();
System.out.println("Street Name: ");
String sname=det.nextLine();
System.out.println("City: ");
String city=det.nextLine();
System.out.println("Pincode: ");
int pin=det.nextInt();
System.out.println("Enter the Details");
System.out.println("Name: "+name);
System.out.println("Father Name: "+fname);
System.out.println("Door Number: "+dr);
System.out.println("Street Name: "+sname);
System.out.println("City: "+city);
System.out.println("Pincode: "+pin);
}
}