class UseOfPrint{

public static void main(String [] args){

int a=10, b=20, add, sub;

add=a+b;
sub=a-b;

System.out.println("Addition is "+add);// Valid
//System.out.println("Addition is ",add);// Invalid (C.T. Error)
System.out.println(sub + "Addition is "); // Valid
//System.out.println(sub,add); // Invalid (C.T. Error)
System.out.println(sub + " " + add);// Valid 
System.out.println(sub + ","+sub +","+","+a+" "+b); // Valid
System.out.println("Substraction is "+ sub + "Addition is "+ add);// Valid
System.out.println("Hi"+ "Addition is "+"Hello");// valid
System.out.println("Java"+" "+" "+" "+" Hello");// Valid 
}
}