package javaapplication8;
import java.util.Scanner;
public class JavaApplication8 {

public static void main(String[] args) {
int num;
Scanner input = new Scanner(System.in);
System.out.println("Enter number from 1 to 7 : ");
 num =input.nextInt();
switch(num){
case 1 :
System.out.println("Saturday");
break;
case 2:
System.out.println("Sunday");
break;
case 3:
System.out.println("Monday");
 break;
case 4:
System.out.println("Tuesday");
break;
case 5:
System.out.println("Wednesday");
break;
case 6:
System.out.println("Thursday");
break;
case 7:
System.out.println("Friday");
break;
}
}
}


 