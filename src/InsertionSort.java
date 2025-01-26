public class InsertionSort {
    static void  InsertionSort(){
        int[] arr = {12, 23, 23, 56 , 45,4};
        for (int i = 1; i <arr.length ; i++) {
            int temp = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] >temp){
               arr[j+1] = arr[j];
               j--;
            }
            arr[j+1] =temp;
        }

        for(int a : arr){
            System.out.printf("%d\t",a);
        }

    }
    public static void main(String[] args) {
        int[] array = {9,1,8,8,5,0,10};
        insertSort(array);
        for (int a :array){
            System.out.print(a+" ");
        }
        System.out.println("\n");
        InsertionSort();
    }
    static void insertSort(int[] array){
        for (int i = 1; i <array.length ; i++) {
            int temp = array[i];
            int j = i -1;
            while (j >=0 && array[j]>temp){
               array[j + 1] = array[j];
               j--;
            }
            array[j+1] = temp;

        }
    }
}
