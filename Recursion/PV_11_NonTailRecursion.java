public class PV_11_NonTailRecursion {
    static public int print(int n){
        if(n<1){
            return 0;
        }
        else{
            return 1 + print(n/2);
        }
    }
    static public void main(String args[]){
        System.out.println(print(5));
    }
}
