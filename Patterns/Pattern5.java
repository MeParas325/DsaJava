public class Pattern5 {
    public static void main(String args[]){

        char ch = 'A';

        for(int i = 0; i<3; i++){
            for(int j = 1; j<=3; j++){
                int ch2 = ch + i + j - 1;
                System.out.print((char)ch2+" ");
            }
            System.out.println();
        }
    }
    
}
