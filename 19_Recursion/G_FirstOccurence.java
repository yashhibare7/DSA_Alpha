public class G_FirstOccurence {
    public static int FirOccu(int arr[],int key,int i){
        if (i==arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return FirOccu(arr, key, i+1);
    }
    public static void main(String args[]){
        int arr[] = {2,6,8,9,3,5,1,11,18,10,43};
        System.out.println(FirOccu(arr, 5, 0));
    }
}
