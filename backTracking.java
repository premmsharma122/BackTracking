package BackTracking;

public class backTracking {
    public static void changeArr(int i, int val , int arr[]){
        // base case
        if(i==arr.length){
            printArr(arr);
            return;
        }
        arr[i] =val;
        //recursion step
        changeArr(i+1, val+1, arr);
        arr[i] = arr[i]-2;
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArr(0, 1, arr); // here is the array of base case
        System.out.println();
        printArr(arr); // here is the backtrack array

    }
}
