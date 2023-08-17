// minimize the maxsum of any array when we divide it into subarrays => (Google)
public class PV_10_Question {

    static int splitArray(int arr[], int m) {

        int start = 0, end = 0;

        for(int i = 0; i < arr.length; i++) {

            start = Math.max(start, arr[i]);
            end += arr[i];

        }

        while(start < end) {

            int mid = start + (end - start) / 2;
            int sum = 0, pieces = 1;

            for(int num: arr) {

                if(sum + num > mid) {

                    pieces++;
                    sum = num;

                } else {

                    sum += num;

                }
            }

            if(pieces <= m) {

                end = mid;

            } else {

                start = mid + 1;

            }


        }

        return start;
    }

    public static void main(String args[]) {

        int arr[] = {7, 2, 5, 8, 10};

        System.out.println(splitArray(arr, 5));


    }
    
}
