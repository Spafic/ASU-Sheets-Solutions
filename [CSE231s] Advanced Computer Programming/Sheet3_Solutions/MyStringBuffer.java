public class MyStringBuffer {
    private char[] buffer;

    public MyStringBuffer(String str) {
        // convert passed str to char array
        buffer = str.toCharArray();
    }

    public void print() {
        // print the buffer
        System.out.println(buffer);
        // toString method convert array to string
    }

    public int indexOf(char c) {
        // search for the index of the passed char
        for (int i = 0; i < buffer.length; i++) {
            if (buffer[i] == c) {
                return i;
            }
        }
        return -1; //not found
    }

    public int length() {
        // return the length of the buffer
        return buffer.length;
    }

    public void erase(int index, int length) {
        if (index >= buffer.length || index < 0 || length < 0 || length > buffer.length - index) {
            // check if any input will casue out of bounds exception
            throw new IndexOutOfBoundsException("Error : Out Of Bounds Exception !!");
        }
        char[] newbuffer = new char[buffer.length - length];
        // arraycopy(Object src, int srcPos,Object dest, int destPos, int length)
        System.arraycopy(buffer, 0, newbuffer, 0, index);
        System.arraycopy(buffer, index + length, newbuffer, index, buffer.length - length - index);
        buffer = newbuffer;
    }

    public void insert(int index, String str) {
        if (index > buffer.length || index < 0) {
            // check if any input will casue out of bounds exception
            throw new IndexOutOfBoundsException("Error : Out Of Bounds Exception !!");
        }
        char[] newbuffer = new char[buffer.length + str.length()];
        // arraycopy(Object src, int srcPos,Object dest, int destPos, int length)
        System.arraycopy(buffer, 0, newbuffer, 0, index);
        System.arraycopy(str.toCharArray(), 0, newbuffer, index, str.length());
        System.arraycopy(buffer, index, newbuffer, index + str.length(), buffer.length - index);
        buffer = newbuffer;
    }
    
    public static void main(String[] args) {
        MyStringBuffer str = new MyStringBuffer("Hello world!");
        //hello worl d !
        //01234567891011  length = 12
        str.print();
        System.out.println("Index of 'e' : " + str.indexOf('e'));
        //Answer is 1
        System.out.println("Length of the buffer : " + str.length());
        //Answer is 12
        str.erase(6, 5);
        str.print();
        //Answer is "Hello !"

        //note ... that array now contain --> "Hlo ASU!" <-- and its length is 8 not "Hello ASU!"
        str.insert(6, "ASU");
        str.print();
        //Answer is "Hilo ASU!"
    }
}
