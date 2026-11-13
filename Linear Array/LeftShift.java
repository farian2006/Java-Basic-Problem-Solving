public class LeftShift {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };

        int j = arr.length - 1;

        for (int i = 0; i < j; i++) {
            arr[i] = arr[i + 1];
        }
        arr[j] = 0;

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
