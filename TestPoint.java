
package testpoint;
import java.util.Scanner;
public class TestPoint {

    public static void main(String[] args) {
       
point a =new point();
point b = new point(9,18);
 System.out.print("Enter the tow number");   
   
Scanner input =new Scanner(System.in) ;
int number1=input .nextInt();
int number2=input .nextInt();
point c = new point(number1,number2);
a.PrintPoint();
b.PrintPoint();
 c .PrintPoint();
 a.setx(700);
 a.sety(600);
 a.PrintPoint();
}

}