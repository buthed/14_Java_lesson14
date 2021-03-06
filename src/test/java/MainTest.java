import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MainTest {

    @Test
    void task1Test() {
    }

//    @CsvSource(){
//        "value = {1, 1, 1, 4, 4, 1, 4, 4}, true",
//        "value = {1, 1, 1, 4, 4, 1, 4, 5}, false"
//    }
//    @
    @Test
    void task2Test() {
        int[] arr = {1, 1, 1, 4, 4, 1, 4, 4};
        boolean b = true;
        boolean c = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1 || arr[i] == 4) {
            } else c = false;
        }
        Assertions.assertEquals(b, c);
    }
}