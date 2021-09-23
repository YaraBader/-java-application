/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date;
import java.util.Scanner;

/**
 *
 * @author Sarah
 */
public class Date {
    public static void main(String[] args) {
Date1 today =new Date1(); // call method (نعرف متغير هنا عشان نستدعي الميثود منه)
today.displayDate(); // نعرف متغير هنا عشان نقدر نستدعي الميثود 

        today.setD(3); // لو كنت  ابي اغير قيمة واحد منهم 
        today.displayDate(); // يغير القيمة الحين لان الميثود الاولى  قبل التغيير
        
        Date1 myBD=new Date1(17,7,1990); // لو بنغير المتغير والاعداد
        myBD.displayDate(); 
        
        // لو ابي البيانات يدخلها اليوزر 
        Scanner input=new Scanner(System.in);
        System.out.println("Enter date");
        int d1=input.nextInt();
                int m1=input.nextInt();
        int y1=input.nextInt();
        myBD.setM(m1);
           myBD.setD(d1);
                      myBD.setY(y1);


        Date1 UserBD=new Date1(d1,m1,y1); // 
        UserBD.displayDate();
        }
    
}

// اذا كانت ستاتيك نقدر نستدعيها على طول باسمها 
// ex:math.max()