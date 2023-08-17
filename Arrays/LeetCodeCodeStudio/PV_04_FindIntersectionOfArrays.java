import java.util.ArrayList;

public class PV_04_FindIntersectionOfArrays {

    public static void findArrayIntersection(int arr1[], int n, int arr2[], int m)
	{
        int i = 0, j = 0;
        
        ArrayList<Integer> newArrayList = new ArrayList<Integer>();
        
		while(i<n && j<m){
            if(arr1[i] == arr2[j]){
                newArrayList.add(arr1[i]);
                i++;
                j++;  
            }
            else if(arr1[i] < arr2[j]){
                i++;
            }
            else{
                j++;
            }
        }

        for(int k = 0; k<newArrayList.size(); k++){
            System.out.print(newArrayList.get(k)+" ");
        }
        

	}
    public static void main(String args[]){

        int arr1[] = {1, 2, 2, 2, 3, 4};
        int arr2[] = {2, 2, 3, 3, 4, 5};   

        findArrayIntersection(arr1, arr1.length, arr2, arr2.length);

    }
}
