import java.util.Scanner;

public class Insertion{

    public static void insertion(int arr[], int element, int pos, int n){
        if(pos >= arr.length){
            System.out.println("Element cannot be inserted.");
            return;
        }
        for(int i = n-1; i>=pos; i--){
            arr[i+1] = arr[i];
        }
        arr[pos] = element;
    }

    public static int[] deletion(int arr[], int element){
        int anotherArray[] = new int[arr.length - 1];
        boolean var1 = false;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == element){
                for(int j = i; j<arr.length-1; j++){
                    arr[j] = arr[j+1];
                    var1 = true;
                }
            }
        }
        if(var1){
            for(int i = 0; i<anotherArray.length; i++){
                anotherArray[i] = arr[i];
            }
            return anotherArray;
        }
        System.out.println("Element is not found.");
        return arr;
    }

    public static void updation(int arr[], int element, int pos){
        for(int i = 0; i<arr.length; i++){
            if(i == pos){
                arr[i] = element;
                return;
            }
        }
        System.out.println("Element is not found.");
    }

    public static void display(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int element, pos, n = 5;
        int arr[] = new int[n+1];

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("-----------Menu----------");
            System.out.println("1.Insertion");
            System.out.println("2.Deletion");
            System.out.println("3.Updation");
            System.out.println("4.Traversal");
            System.out.println("5.Exit");

            System.out.println("Choose your option:");
            int option = sc.nextInt();
        
            switch(option){
                case 1:
                    System.out.println("Enter any element to insert into the array");
                    element = sc.nextInt();
                    System.out.println("Enter the position of any element start with 0:");
                    pos = sc.nextInt();
                    insertion(arr, element, pos, n);
                    break;
                
                case 2:
                    System.out.println("Enter element which you want to delete from an array:");
                    element = sc.nextInt();
                    arr = deletion(arr, element);
                    break;
                
                case 3:
                    System.out.println("Enter any element to update into the array");
                    element = sc.nextInt();
                    System.out.println("Enter the position of any element start with 0 which you want to update:");
                    pos = sc.nextInt();
                    updation(arr, element, pos);
                    break;
                
                case 4:
                    display(arr);
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice.");
                    break;     
            }
        }
    }
}