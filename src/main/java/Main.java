import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        task1(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7});
        System.out.println(task2(new int[]{1, 1, 1, 4, 4, 1, 4, 4}));
    }

    public static void task1(int arr[]) {
        int startNewArr = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                startNewArr = i + 1;
            }
        }
        System.out.println(startNewArr);
        int[] arr2 = new int[arr.length - startNewArr];

        for (int i = 0; i < arr.length - startNewArr; i++) {
            arr2[i] = arr[startNewArr+i];
        }
        System.out.println(Arrays.toString(arr2));
    }
    public static boolean task2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1 || arr[i] == 4) {
            } else return false;
        }
        return true;
    }
}