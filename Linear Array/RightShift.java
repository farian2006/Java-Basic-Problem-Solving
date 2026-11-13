public class RightShift {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };

        int j = arr.length - 1;

        for (int i = j; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = 0;

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
// 42:41