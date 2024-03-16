public class Problem3 {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
        //loops on numbers form o --> 9
        if (i%2 == 0)
        break;
        //break the loop if i is an even number [0 2 4 6 8] so at first iteration i=0 ,i%0=0 
        //loop will be executed for one time with no print
        System.out.println(i+ " " + i * i);
        }
    }
    //This code output nothing!
    
}
