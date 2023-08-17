public class PV_12_Power {
    static public int power(int a, int b){
        if(b == 0){
            return 1;
        }
        else{
            return a * power(a, b-1);
        }

    }
    public static void main(String args[]){
        System.out.println(power(3, 7));

    }
}
