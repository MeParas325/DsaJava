public class PV_09_TailRecursion {
    static public void print(int n){
        if(n<=0){
            return;
        }
        else{
            System.out.println(n);
            print(n/2);
        }
    }
    static public void main(String args[]){
        print(10);
    }
}
