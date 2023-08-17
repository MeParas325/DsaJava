public class PV_07_Fact{
    public static int func1(int n){
        if(n<=1){
            return 1;
        }
        else{
            return n * func2(n-1);
        }
    }
    public static int func2(int n){
        if(n<=1){
            return 1;
        }
        else{
            return n * func1(n-1);
        }
    }
    static public void main(String args[]){
        System.out.println(func1(5));
    }
}