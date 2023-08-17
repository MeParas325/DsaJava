public class Pattern11 {
    public static void main(String args[]){

        int n = 4;

        for(int i = 0; i<n; i++){
            for(int j = 1; j<=n; j++){
                if(j<=i){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    
}
