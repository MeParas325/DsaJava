public class PV_10_NonTailRecursion {
    static public void print(int n){
        if(n<=0){
            return;
        }
        else{
            System.out.println(n);
            print(n/2);
            System.out.println(n);
        }
    }
    static public void main(String args[]){
        print(10);
    }
}
