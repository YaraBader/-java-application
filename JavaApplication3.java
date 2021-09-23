package javaapplication3;

public class JavaApplication3 {
   
public static void main(String[] args) {
int A[] = {1,4,6,9,88,90};
int sum = 0;
for( int num : A) {
 sum = sum+num;
}
System.out.println("Sum of array elements is : " +sum);
}
}