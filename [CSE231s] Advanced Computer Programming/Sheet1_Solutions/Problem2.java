public class Problem2 {
    
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
        //loops on numbers form o --> 9
        if (i%2 == 0)
        continue;
        //skips iteration if i is an even number [0 2 4 6 8]
        System.out.println(i+ " " + i * i);
        //Prints odd numbers and its square 
        /* output will be:
         1 1
         3 9
         5 25
         7 49
         9 81
         */
        }
    }
        
}
