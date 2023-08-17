public class Pattern7 {
    public static void main(String args[]){

        char ch = 'A';
        int count = 0;

        for(int i = 0; i<3; i++){
            for(int j = 0; j<=i; j++){
                int ch2 = ch + count++;
                System.out.print((char)ch2 + " ");
            }
            System.out.println();
        }
    }
}
