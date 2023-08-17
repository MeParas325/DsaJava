public class PV_01_2DArray{
    public static void main(String args[]){

        int twoArray[][] = new int[4][];
        twoArray[0] = new int[2];
        twoArray[1] = new int[3];
        twoArray[2] = new int[4];
        twoArray[3] = new int[5];
        int k = 0;

        for(int i = 0; i<4; i++){
            for(int j = 0; j<i+2; j++){
                twoArray[i][j] = k++;
            }
        }

        for(int i = 0; i<4; i++){
            for(int j = 0; j<i+2; j++){
                System.out.print(twoArray[i][j]+" ");
            }
            System.out.println();
            
        }


    }
}