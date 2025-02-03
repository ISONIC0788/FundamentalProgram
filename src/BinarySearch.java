import java.util.Arrays;

public class BinarySearch {
    public  static int binarySearch(int[] arr , int traget , int low , int high  ){
         while (low <= high){
             int mid = low + (high - low)/2;
             if (arr[mid]==traget){
                 return mid;
             }else if (arr[mid]<traget){
                 low = mid + 1;
             }else {
                 high = mid-1;

             }
         }
         return  -1;
    }
    public static void main(String[] args) {
        int[] arr ={2,8,7,4,5,5,6};
        Arrays.sort(arr);
        int arrNum = arr.length;
        int target = 7;
        int resul = binarySearch(arr , target , 0,arr.length-1);
        if (resul!=-1){
            System.out.println("The array is fount on index "+resul);
        }else {
            System.out.println("The item is not found ");
        }
    }
}
