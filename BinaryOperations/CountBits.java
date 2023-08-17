public class CountBits{
    static public void main(String args[]){

        int n = 1, m = 10, count = 0;

        while(n != 0 || m != 0){
            if((n & 1) != 0){
                count++;
            }
            if((m & 1) != 0){
                count++;
            }
            n = n >> 1;
            m = m >> 1;

        }

        System.out.println("Number of bits in both numbers: "+count);
    }
}