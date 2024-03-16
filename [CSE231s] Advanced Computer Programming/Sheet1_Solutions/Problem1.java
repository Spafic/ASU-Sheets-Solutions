import java.lang.Math;
//class to help us use the Math methods && Constants
public class Problem1{
    public static void main(String[] args){
        // A rectangle with width and height of 4 and 5.5 respectively
        //Area of rectangle is 4*5.5 Which is float
        System.out.println("Area of A rectangle with width and height of 4 and 5.5 respectively is : " + 4*5.5); 
        //A square whose side equals 10
        System.out.println("Area of A square whose side equals 10 is : " + Math.pow(10,2)); 
        //flexing with math functions ... Can be written as 10*10

        //A circle whose radius equals 3.2
        System.out.println("Area of A circle whose radius equals 3.2 is : " + (Math.PI)*(Math.pow(3.2,2))); 
        //we can use Math.PI to get value of PI = 3.141592653589793
    }

}