public class LeanerSearch {
    public static int learnsearch(int[] arr , int n , int target){
        for (int i = 0; i < n ; i++) {
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
       int[] arr ={2,8,7,4,5,5,6};
       int arrNum = arr.length;
       int target = 8;
       int resul = learnsearch(arr , arrNum, target);
       if (resul!=-1){
           System.out.println("The array is fount on index "+resul);
       }else {
           System.out.println("The item is not found ");
       }

    }
}
