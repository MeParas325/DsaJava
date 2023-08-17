public class Pattern8 {
    static public void main(String args[]){

        char ch = 'A';

        for(int i = 0; i<4; i++){
            int ch2 = ch + 4 - i - 1;
            for(int j = 0; j<=i; j++){
                System.out.print((char)ch2++ + " ");
            }
            System.out.println();
        }
    }
}
