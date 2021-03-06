import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(task1(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7})));
        System.out.println(task2(new int[]{1, 1, 1, 4, 4, 1, 4, 4}));
    }

    public static int[] task1(int[] arr) {
        int startNewArr = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                startNewArr = i + 1;
            }
        }
        int[] arr2 = new int[arr.length - startNewArr];

        for (int i = 0; i < arr.length - startNewArr; i++) {
            arr2[i] = arr[startNewArr+i];
        }
        return arr2;
    }

    public static boolean task2(int[] arr) {
        int countOne = 0;
        int countFour = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1){
                countOne+=1;
            } else if (arr[i] == 4) {
                countFour+=1;
            } else return false;
        }
        if (countOne != 0 && countFour != 0 ) return true;
        else return false;
    }
}