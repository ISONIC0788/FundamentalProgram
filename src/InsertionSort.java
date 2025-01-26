public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {9,1,8,8,5,0,10};
        insertSort(array);
        for (int a :array){
            System.out.print(a+" ");
        }
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
