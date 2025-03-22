import java.util.Scanner;
class Nestedifelse{
public static void main(String[] args){

int age;
int weight;

Scanner sc= new Scanner(System.in);
System.out.println("Enter age :");
age=sc.nextInt();
System.out.println("Enter Weight :");
weight=sc.nextInt();

if(age>=18)
{
   if(weight>=50)
	{
	System.out.println("Your eligible to donate blood");
	}
	else{
	System.out.println("Your not eligible to donate blood");
	}
}
else{
System.out.println("Your not eligible to donate blood");
}
}
}