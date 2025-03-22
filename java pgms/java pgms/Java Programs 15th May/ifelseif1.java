class ifelseif1{
public static void main(String[] args){

int English=100, Math=100, Science=100, History=100, Geo=100;

float percentage= (English+Math+Science+History+Geo)/5;
System.out.println(percentage);

if((percentage>=90) && (percentage <=95) ){
System.out.println("Grade A");
}
else if((percentage>=80) && (percentage < 90)){
System.out.println("Grade B");
}
else if((percentage>=70) && (percentage < 80)){
System.out.println("Grade C");
}
else if((percentage>=60)&& (percentage < 70)){
System.out.println("Grade D");
}
else if((percentage>=50) && (percentage <60)){
System.out.println("Grade E");
}
else{
System.out.println("Fail");
}
}
}


