
package testpoint;

public class point {
   private int x;
    private int y;
    public Point(){x=0 ; y=0 ;}
    public Point(int a,int b){x=a ; y=b ;}
     public void setx(int z){x=z;}
     public void setx(int w){y=w;}
     public getx(){return x;}
     public gety(){return y;}
    public void PrintPoint(){
         System.out.print("( "+getx()+","+gety()+")");
     
}
}
