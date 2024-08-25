// 22 June 2024
// TCS - Solution 1
// import java.util.ArrayList;

// public class PV_02_ExtractNumber {

//     public static void main(String args[]) {

//         String str = "Another number 97";

//         String[] words = str.split(" ");

//         ArrayList<Long> arrayList = new ArrayList<>();

//         for(int i = 0; i < words.length; i++) {
//             if((words[i].charAt(0) >= 'a' && words[i].charAt(0) <= 'z') || ((words[i].charAt(0) >= 'A' && words[i].charAt(0) <= 'Z'))) continue;
//             else {
//                 long number = Long.parseLong(words[i]);
//                 boolean isNineExist = false;
//                 while(number != 0) {
//                     long rem = number % 10;
//                     number /= 10;
//                     if(rem == 9) isNineExist = true;
//                 }
//                 if(!isNineExist) arrayList.add(Long.parseLong(words[i]));
//             } 
//         }

//         long largestNumber;
//         if(arrayList.isEmpty()) largestNumber = -1;
//         else largestNumber = arrayList.get(0);

//         for(int i = 1; i < arrayList.size(); i++) {
//             if(arrayList.get(i) > largestNumber) largestNumber = arrayList.get(i);
//         }

//         System.out.println(largestNumber);
//     }
// }

//TCS - Solution 2
// import java.util.ArrayList;

// public class PV_02_ExtractNumber {

//     public static void main(String args[]) {

//         String str = "Another number 97";

//         String[] words = str.split(" ");

//         ArrayList<Long> arrayList = new ArrayList<>();

//         for(int i = 0; i < words.length; i++) {
//             if(Character.isDigit(words[i].charAt(0))) {
//                 long number = Long.parseLong(words[i]);
//                 boolean isNineExist = false;
//                 while(number != 0) {
//                     long rem = number % 10;
//                     number /= 10;
//                     if(rem == 9) isNineExist = true;
//                 }
//                 if(!isNineExist) arrayList.add(Long.parseLong(words[i]));
//             } 
//         }

//         long largestNumber;
//         if(arrayList.isEmpty()) largestNumber = -1;
//         else largestNumber = arrayList.get(0);

//         for(int i = 1; i < arrayList.size(); i++) {
//             if(arrayList.get(i) > largestNumber) largestNumber = arrayList.get(i);
//         }

//         System.out.println(largestNumber);
//     }
// }

// TCS - Solution 3
// public class PV_02_ExtractNumber {

//     public static void main(String args[]) {

//         String str = "Another number 97";

//         String[] words = str.split(" ");
//         long largestNumber = -1;

//         for(int i = 0; i < words.length; i++) {
//             if(Character.isDigit(words[i].charAt(0))) {
//                 long number = Long.parseLong(words[i]);
//                 boolean isNineExist = false;
//                 while(number != 0) {
//                     long rem = number % 10;
//                     number /= 10;
//                     if(rem == 9) isNineExist = true;
//                 }
//                 if(!isNineExist) {
//                     if(Long.parseLong(words[i]) > largestNumber) {
//                         largestNumber = Long.parseLong(words[i]);
//                     }
//                 }
//             } 
//         }

//         System.out.println(largestNumber);
//     }
// }

// TCS - Solution 4
public class PV_02_ExtractNumber {

    public static void main(String args[]) {

        String str = "Another number 97";

        String[] words = str.split(" ");
        long largestNumber = -1;

        for(int i = 0; i < words.length; i++) {
            if(Character.isDigit(words[i].charAt(0))) {
                long temp = Long.parseLong(words[i]);
                long number = temp;
                boolean isNineExist = false;
                while(temp != 0) {
                    long rem = temp % 10;
                    temp /= 10;
                    if(rem == 9) isNineExist = true;
                }
                if(!isNineExist) {
                    if(number > largestNumber) {
                        largestNumber = number;
                    }
                }
            } 
        }

        System.out.println(largestNumber);
    }
}