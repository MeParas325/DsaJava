public class Pattern12 {
    static public void main(String args[]){

        int n = 6;

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                if(j<i){
                    System.out.print(" ");
                }else{
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }
}
