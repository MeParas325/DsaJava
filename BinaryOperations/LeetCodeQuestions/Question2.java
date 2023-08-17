public class Question2 {
    static public void main(String args[]){

        int n = 5;
        int mask = 0, m = n;

        while(m != 0){
            mask = (mask << 1) | 1;
            m = m >> 1;
        }
        int ans = (~n) & mask;
        System.out.println(ans);

    }
}
