/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package point;

/**
 *
 * @author Sarah
 */
public class TwoPoint {
    private int x,y;
    
    public TwoPoint(){ // كونتسركتوروتهيئه 
        x=0;
        y=0;
    }
    public TwoPoint(int a, int b){ // مو ضروري
        x=a;
        y=b;
                }
    public void setX(int w){// تستقبل وماترجع
        x=w;
    }
    public void setY(int z){
        y=z;
    }
    
    public int getX(){ // ماتستقبل شيءبس ترجع
        return x;
        
    }
    public int getY(){ // ماتستقبل شيء
        return y;
        
    }
    public void PrintPoint(){
        
        System.out.printf("Value of x and z = %d,%d\n",getX(),getY()); /// لا تنسين () // عشان يعرف انه استدعاء
    }
    }

