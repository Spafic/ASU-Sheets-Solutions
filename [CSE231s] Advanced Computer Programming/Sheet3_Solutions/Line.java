// Add the necessary import for javafx.geometry.Point2D
import javafx.geometry.Point2D;

public class Line {
    private Point2D position;
    private Vector TwoDVector;

    // constractor using passed objects
    public Line(Point2D position, Vector TwoDVector) {
        this.position = position;
        this.TwoDVector = TwoDVector;
    }

    // connstartor using passed informations
    public Line(double x_2d, double y_2d, double x_vector, double y_vector) {
        this.position = new Point2D(x_2d , y_2d);
        this.TwoDVector = new Vector(x_vector , y_vector);
    }

    // method to print pos and directions
    public void print() {
        System.out.println("first point is : (" + position.getX() + ", " + position.getY()+")");
        System.out.println("secound point is : (" + TwoDVector.getX() + ", " + TwoDVector.getY()+")");
        System.out.println("Direction Vector : " + Math.toDegrees(Math.atan((TwoDVector.getY()-position.getY()))/((TwoDVector.getX()-position.getX())))+"  degrees");
        
    }

    public static void main(String[] args) {
        Line l1 =new Line(6, 8, 3, 4);
        l1.print();
        System.out.println("__________________________________________________________________");                      
        Line l2 =new Line(new Point2D(6, 8),new Vector(3, 4));
        l2.print();
    }
}
