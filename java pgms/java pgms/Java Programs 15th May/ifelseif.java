class ifelseif{
public static void main(String[] args){

int English=98, Math=90, Science=90, History=90, Geo=96;

float percentage= (English+Math+Science+History+Geo)/5;
System.out.println(percentage);

if(percentage>=90){
System.out.println("Grade A");
}
else if(percentage>=80){
System.out.println("Grade B");
}
else if(percentage>=70){
System.out.println("Grade C");
}
else if(percentage>=60){
System.out.println("Grade D");
}
else if(percentage>=50){
System.out.println("Grade E");
}
else{
System.out.println("Fail");
}
}
}


