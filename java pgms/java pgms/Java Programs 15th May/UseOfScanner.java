
import java.util.Scanner;
class UseOfScanner{
public static void main(String [] args){

int id;
String name;
double Sal;

// To take the input from user create scanner class object
// Classname refrenceVarible= new classname();

Scanner sc= new Scanner(System.in);

System.out.println("Enter user id");

id=sc.nextInt();

System.out.println("Enter user Name");

name= sc.next();

System.out.println("Enter user Salary");

Sal=sc.nextDouble();

System.out.println("User id is : "+id);
System.out.println("User name is :"+ name);
System.out.println("User Salary is :"+Sal);

}
}





