public class A_MergeSort {
    public static void mergesort(int arr[], int si,int ei){
        if (si>=ei){
            return;
        }

        int mid = (si + ei)/2;
        mergesort(arr, si, mid); //left part
        mergesort(arr, mid+1, ei); //right part
        merge(arr,si,mid,ei);
    }

    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = 
    }
    public static void main(String args){
        int arr[] = {6, 3, 9, 5, 2, 8};
    }
}
