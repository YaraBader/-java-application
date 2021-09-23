/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapetest1;

/**
 *
 * @author Sarah
 */
public class square extends TwoDShape {
    private String name;
    public square(int w, int h , String n1){
        super(w,h);
        name =n1;
    }
    public void getName1(String n1){
        name =n1;
    }
    public String getName1(){
        return name;
    }
    public String toString(){
        return String.format("Square class info: \n name: %s\n hight: %d\n width: %d\n",getName1(), getHight(),getWidth());
    }
    
}
