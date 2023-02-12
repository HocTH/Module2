public class InsertSort {
    public static void insertSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }

        }
    }
    public static void printArr(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr [] = {15,12,13,15,16};
        System.out.println("Before sort");
        printArr(arr);
        insertSort(arr);
        System.out.println("After sort");
        printArr(arr);
    }
}
