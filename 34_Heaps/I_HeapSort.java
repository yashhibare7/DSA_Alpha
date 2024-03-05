/*
 Heap Sort

 arr = 1,2,4,5,3  --> 5,1,4,2,3
            
        1                 1                 5
      /   \              / \              /   \
     2     4   --->     5   4   --->     1     4 
   /  \               / \              /  \
  5    3             2   3            2    3
 
  Non-Leaf 
  Node  --> 2,1
 */

public class I_HeapSort {

    public static void heapify(int arr[], int i, int size){
        int left = 2*i+1;
        int right = 2*i+2;
        int maxIdx = i;

        if (left < size && arr[left] > arr[maxIdx]){
            maxIdx = left;
        }

        if (right < size && arr[right] > arr[maxIdx]) {
            maxIdx = right;
        }

        if (maxIdx != i) {
            //swap
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            heapify(arr, maxIdx, size);
        }
    }
    public static void heapSort(int arr[]){
        //step1 - build maxHeap
        int n = arr.length;
        for(int i=n/2; i>=0; i--){
            heapify(arr,i, n);
        }

        //step2 - push largest at end
        for(int i=n-1;i>0;i--){
            //swap
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] =  temp;

            heapify(arr,0, i);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5, 3};
        heapSort(arr);

        //print
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
