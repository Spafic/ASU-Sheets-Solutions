public class ArrayMagnitude  {
    //to get average magnitude of many vectors 
    public static double averageMagnitude(Vector[] vectors){
        double sum=0;
 
        for(Vector vector :vectors){
            sum+=vector.magnitude();
        }
        return sum/vectors.length;
    }
    public static void main(String[] args){
        //  ******************* TEST CASES *******************
        Vector[] vector =new Vector[3];
        vector[0]=new Vector(3,4);
        vector[1]=new Vector(6,8);
        vector[2]=new Vector(4,3);

        System.out.println("Avg. Magnitude = "+averageMagnitude(vector));
    }
  
}
