// Find out the year is leap year or not.
import java.util.Scanner;
class LeapYear{
static{
Scanner sc= new Scanner(System.in);

System.out.println("Please enter a year");
int year=sc.nextInt();

if(year % 4 == 0){

System.out.println(year+" is leap year");
}
else{

System.out.println(year+" is not leap year");
}
}
public static void main(String [] args){

System.out.println("Main method");
}

}