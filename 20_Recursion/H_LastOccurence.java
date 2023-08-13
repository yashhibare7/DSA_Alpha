public class H_LastOccurence {
    public static int LasOcc(int arr[],int key,int i){
        if (i == arr.length){
            return -1;
        }
        int isFound = LasOcc(arr, key, i+1);
        if(isFound == -1 && arr[i] == key ){
            return i;
        }
        return isFound;
    }
    public static void main(String args[]){
        int arr[] = {1,3,4,6,8,9,3,7,2,10};
        System.out.println(LasOcc(arr, 3, 0));
    }
}
