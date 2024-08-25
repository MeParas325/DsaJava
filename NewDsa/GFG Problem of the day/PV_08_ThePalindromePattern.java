// Solution 1 - 28 June 2024
// public class PV_08_ThePalindromePattern{

//     static String pattern(int[][] arr) {

//         int length = arr.length;

//         String palinString = "-1";

//         for(int row = 0;  row < length; row++) {
//             String temp = "";
//             for(int col = 0; col < length; col++) {
//                 temp += arr[row][col];
//             }
//             if(temp.equals(new StringBuilder(temp).reverse().toString())) {
//                 palinString = row + "";
//                 palinString = palinString + " " + "R";
//                 return palinString;
//             }
//         }

//         if(palinString.equals("-1")) {
//             for(int col = 0;  col < length; col++) {
//                 String temp = "";
//                 for(int row = 0; row < length; row++) {
//                     temp += arr[row][col];
//                 }
//                 if(temp.equals(new StringBuilder(temp).reverse().toString())) {
//                     palinString = col + "";
//                     palinString = palinString + " " + "C";
//                     return palinString;
//                 }
//             }
//         }

//         return  palinString;
//     }

//     public static void main(String args[]) {
//         int arr[][] = {{0, 0, 1, 0, 1},
//                        {1, 1, 0, 0, 1},
//                        {0, 0, 1, 1, 1},
//                        {1, 1, 0, 0, 0},
//                        {0, 0, 1, 0, 1}};

//         System.out.println(pattern(arr));
//     }
//  }

// Solution - 2
public class PV_08_ThePalindromePattern {

    public static String pattern(int[][] arr) {
        int length = arr.length;

        String palinString = "-1";

        // for row checking palindrome
        for (int row = 0; row < length; row++) {
            boolean isPalindrome = true;
            for (int col = 0; col < length; col++) {
                if (arr[row][col] != arr[row][length - col - 1]) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) {
                palinString = row + " " + "R";
                return palinString;
            }
        }

        // if didnt find any palindrome in row then finding palindrome in column
        if (palinString.equals("-1")) {
            for (int col = 0; col < length; col++) {
                boolean isPalindrome = true;
                for (int row = 0; row < length; row++) {
                    if (arr[row][col] != arr[length - row - 1][col]) {
                        isPalindrome = false;
                        break;
                    }
                }
                if (isPalindrome) {
                    palinString = col + " " + "C";
                    return palinString;
                }
            }
        }

        return palinString;
    }


    public static void main(String args[]) {
        int arr[][] = { { 0, 0, 1, 0, 1 },
                { 1, 1, 0, 0, 1 },
                { 0, 0, 1, 1, 1 },
                { 1, 1, 0, 0, 0 },
                { 0, 0, 1, 0, 1 } };

        System.out.println(pattern(arr));
    }
}