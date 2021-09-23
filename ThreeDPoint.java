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
public class ThreeDPoint extends TwoDpoint {
    private int z;
    
    public ThreeDPoint()
    {
        super();
        z=0;
    }
    public ThreeDPoint(int a, int b)
    {
        super(a,b);
        z=b;
    }
    public void setZ(int p){
        z=p;
    }
    
    public int getZ(){
        return z;
    }
    @Override
    public int getX(){
        return super.getX();
    }
    @Override
    public int getY(){
        return super.getY(); 
    }
    public void PrintPoint1()
    {
        System.out.printf("%d%d%d",getX(),getY(),getZ());
    }
    
    
}
