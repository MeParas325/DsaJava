public class PV_07_Bit{

    public static void main(String arggs[]) {
        int count = 0;

        for(int i = 10; i <= 15; i++) {
            int countSetBit = 0;
            int temp = i;
            while(temp > 0) {
                int endBit = temp & 1;
                if(endBit == 1) {
                    countSetBit++;
                }
                temp = temp >> 1;
            }
            boolean isPrime = true;
            if(countSetBit == 2) {
                count++;
                isPrime = false;
            } else if(countSetBit > 2) {
                for(int j = 2; j < 15; j++) {
                    if(countSetBit % j == 0 && countSetBit != j) {
                        isPrime = false;
                    }
                }
            }

            if(isPrime && countSetBit >= 2) {
                count++;
            }
        }

        System.out.println(count);
    }
}