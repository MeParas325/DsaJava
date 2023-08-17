public class BinaryToDecimal {
    static public void main(String args[]){

        int n = 00110;
        System.out.println(n);
        int power = 0;
        int answer = 0;

        while(n != 0){

            int bit = n % 10;
            n = n / 10;

            answer = (int)(bit * Math.pow(2, power)) + answer;
            power++;
        }

        System.out.println("Answer is: "+answer);
    }
}
