//imuutable is to make class data field not modifiable 
//inset && erase should be removed also if there were setters
public class MyString {
    private final String MyStr;
    // to assign variable once and never change it again once it took a value

    public MyString(String MyStr) {
        // convert passed str to char array
        this.MyStr = MyStr;
    }

    public void print() {
        // print the buffer
        System.out.println(MyStr);
        // toString method convert array to string
    }

    public int indexOf(char c) {
        // search for the index of the passed char
        for (int i = 0; i < MyStr.length(); i++) {
            if (MyStr.indexOf(c) > 0 && MyStr.indexOf(c) < MyStr.length()) {
                return MyStr.indexOf(c);
            }
        }
        return -1; // not found
    }

    public int length() {
        // return the length of the buffer
        return MyStr.length();
    }

   
    public static void main(String[] args) {
        MyString str = new MyString("Hello world!");
        // hello worl d !
        // 01234567891011 length = 12
        str.print();
        System.out.println("Index of 'e' : " + str.indexOf('e'));
        // Answer is 1
        System.out.println("Length of the buffer : " + str.length());
        // Answer is 12
      
    }
}
