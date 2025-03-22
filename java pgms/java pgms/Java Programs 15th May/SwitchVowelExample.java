import java.util.Scanner;
class SwitchVowelExample{
public static void main(String [] args){

char ch;
Scanner sc= new Scanner(System.in);
System.out.println("Enter a Character ");
ch=sc.next().charAt(0);
System.out.println(ch);
char c=Character.toLowerCase(ch); // To convert the Uppercase to lowercase //Character.toUpperCase(ch);
 
switch(c){

case 'a':
System.out.println("Vowel");
break;
case 'e':
System.out.println("Vowel");
break;
case 'i':
System.out.println("Vowel");
break;
case 'o':
System.out.println("Vowel");
break;
case 'u':
System.out.println("Vowel");
break;

default:
System.out.println("Consonant");

}
}
}