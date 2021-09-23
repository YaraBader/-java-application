/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date;

/**
 *
 * @author Sarah
 */
public class Date1 {
  private int m;  
private int d; // day
private int y; // year

public Date1(){ // هنا كونستركتور لانه مايرجع ولا قيمة
m=02;
d=27;
y=2018;

}
   public Date1(int a, int b, int c) // ارقومنت كونتسركتو عشان التهيئه
   {
m=a;// نقدر نسميهم نفس الاسم بس نضيف ذس عشان مايلخبط 
d=b;
y=c;
}
public void setM( int a )
{
   m = a; 
} 
 public int getM()
{
   return m;
 }
 public void setD( int b )
{
   d =b; 
} 
 public int getD()
{
   return d;
 }
public void setY( int c )
{
   y =c ; 
} 
 public int getY()
{
   return y;
 }
 
   public void displayDate(){ // print date 
       System.out.printf("The date is %d /%d %d \n",getM(),getD(),getY());
   }
}
    

