public class F_ArrayIsSortedOrNot {
    public static boolean SortOrNot(int arr[],int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return SortOrNot(arr , i+1);
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        System.out.println(SortOrNot(arr, 0));
    }
}
