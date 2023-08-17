public class Pattern3{
    public static void main(String args[]){

        char ch = 'A';
        int j;

        for(int i = 1; i<=4; i++){
            for(j = 1; j<=4; j++){
                int ch2 = ch + i - 1;
                System.out.print((char)ch2 + " ");
            }
            System.out.println();
        }
    }
}