public class Pattern13 {
    static public void main(String args[]){

        int n = 4;

        for(int i = 1; i<=n; i++){
            for(int j = 0; j<n; j++){
                if(j >= n-i){
                    System.out.print(i);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
