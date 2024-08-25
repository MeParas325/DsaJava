// find nth magic number
public class PV_04_Bit{
    public static void main(String args[]) {

        int n = 1;
        int magicNumber = 0, i = 1;

        while(n != 0) {
            int lastBit = n & 1;
            magicNumber += lastBit * Math.pow(5, i++);
            n = n >> 1;
        }

        System.out.println("Magic Number is: " + magicNumber);


    }
}