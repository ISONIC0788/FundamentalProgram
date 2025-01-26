public class BubbleSort {
    static void BubbleSort2(){
        int array[] = {0,7,2,9,5,3,6};
        for (int i = 0; i <array.length-1 ; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println("\n");
        for (int a :array){
            System.out.printf("%d\t",a);
        }
    }
    public static void main(String[] args) {
        int array[] = {34, 34, 2 , 23,78};
        for (int i = 0; i < array.length -1 ; i++) {
            for (int j = 0; j < array.length - i -1 ; j++) {
                if (array[j] >array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }

        }
        for (int a : array){
            System.out.printf("%d\t",a);
        }
        BubbleSort2();
    }


}
