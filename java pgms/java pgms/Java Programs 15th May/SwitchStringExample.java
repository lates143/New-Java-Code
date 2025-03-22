
class SwitchStringExample{
public static void main(String [] args){

char ch='A';
if(ch=='a' || ch=='A' )
System.out.println("Vowel");

String level="Expert";

switch(level){

case "Beginner":
System.out.println("Level 1");
break;
case "Intermediate":
System.out.println("Level 2");
break;
case "Expert":
System.out.println("Level 3");
break;
default:
System.out.println("Level 0");
break;
}
}
}