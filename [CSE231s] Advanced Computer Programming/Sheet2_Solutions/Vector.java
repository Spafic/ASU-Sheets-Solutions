import java.util.Scanner;

public class Vector {
    private double x;
    private double y;

    public Vector() {
    } // empty constractor

    public Vector(double x, double y) {
        // public constractor to get intial values of object
        this.x = x;
        this.y = y;
    }

    // Defining getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Defining setters
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // method to get magnitude of current vector
    public double magnitude() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    // method to get angle of current vector
    public double angle() {
        return Math.atan(this.y / this.x);// angle in rad
        // Math.toDegrees();
    }

    // method to print vector in its 2 forms
    public void print() {
        System.out.println("vector is in rectangular form : ( " + this.x + " i + " + this.y + " j )");
        System.out.println("vector is in polar form : ( " + this.magnitude() + " [ " + this.angle() + " ] )");
    }

    // Adding vectors method
    public Vector add(Vector v) {
        Vector newVector = new Vector(this.x + v.getX(), this.y + v.getY());
        return newVector;
    }

    // subtracting vectors method
    public Vector sub(Vector v) {
        Vector newVector = new Vector(v.getX() - this.x, v.getY() - this.y);
        return newVector;
    }

    public static void main(String[] arg) {
        // input values
        // ******************* TEST CASES *******************
        System.out.println("Enter X and Y components of vector 1 seprated by space : ");
        Scanner input1 = new Scanner(System.in);
        double vec1X = input1.nextDouble();
        double vec1Y = input1.nextDouble();
        System.out.println("__________________________________________________________________");

        Vector vector1 = new Vector(vec1X, vec1Y);
        System.out.println("x comp. is " + vector1.getX() + " y comp. is " + vector1.getY());
        System.out.println("__________________________________________________________________");

        // taking new values from user for setters
        System.out.println("Enter X and Y components of vector 1 seprated by space : ");
        Scanner mod1 = new Scanner(System.in);
        double mod_X = mod1.nextDouble();
        double mod_Y = mod1.nextDouble();
        System.out.println("__________________________________________________________________");
        
        // settin new values
        vector1.setX(mod_X);
        vector1.setY(mod_Y);
        System.out.println("setted x comp. is " + vector1.getX() + " setted y comp. is " + vector1.getY());
        System.out.println("__________________________________________________________________");
        // magnitude of vector
        System.out.println("magnitude of vector is :" + vector1.magnitude());
        // angle
        System.out.println("angle of vector is :" + vector1.angle() + " rad");
        System.out.println("angle of vector is :" + Math.toDegrees(vector1.angle()) + " deg");
        System.out.println("__________________________________________________________________");
        vector1.print();
        System.out.println("__________________________________________________________________");

        // taking new values from user for secound vector
        System.out.println("Enter X and Y components of vector 2 seprated by space : ");
        Scanner input2 = new Scanner(System.in);
        double vec2_X = input2.nextDouble();
        double vec2_Y = input2.nextDouble();
        System.out.println("__________________________________________________________________");


        // defining vector 2
        Vector vector2 = new Vector(vec2_X, vec2_Y);
        System.out.println("x comp. is " + vector1.getX() + " y comp. is " + vector1.getY());
        System.out.println("x comp. is " + vector2.getX() + " y comp. is " + vector2.getY());
        // vector adding
        Vector sum = vector1.add(vector2);
        System.out.println("adding two vectors result: ");
        sum.print();
        System.out.println("__________________________________________________________________");
        System.out.println("subtracting two vectors result: ");
        Vector sub = vector1.sub(vector2);
        sub.print();

    }
}
