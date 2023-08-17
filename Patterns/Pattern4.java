public class Pattern4 {
    static public void main(String args[]){

        char ch = 'A';

        for(int i = 1; i<=5; i++){
            for(int j = 1; j<=5; j++){
                int ch2 = ch + j - 1;
                System.out.print((char)ch2 + " ");
            }
            System.out.println();
        }
    }
}
