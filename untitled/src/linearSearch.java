public class linearSearch {

    public static final int NOT_FOUNDED = -1;

    public static int linear(int[]arr, int x){
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]== x){
                return i;
            }
        }
        return NOT_FOUNDED;
    }
    public static int binary(int[]arr, int x){
        int begin = 0;
        int end = arr.length -1;
        int mid;
        while (begin <= end){
            mid = (begin + end)/2;
            if (arr[mid]==x){
                return mid;
            } else if (arr[mid]> x) {
                end = mid-1;
            } else {
                begin = mid +1;
            }
        }
        return NOT_FOUNDED;
    }
}