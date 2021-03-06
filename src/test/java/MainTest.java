import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

class MainTest {



    static Stream<Arguments> arrayPlusArray() {
        return Stream.of(
                Arguments.of((Object) new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7 }, (Object) new int[]{1, 7}),
                Arguments.of((Object) new int[]{1, 4, 4, 1, 1, 4, 3}, (Object) new int[]{3}),
                Arguments.of((Object) new int[]{1, 2, 4, 4, 2, 3, 1, 7 }, (Object) new int[]{2, 3, 1, 7}),
                Arguments.of((Object) new int[]{1, 2, 4, 4, 4, 3, 1, 7 }, (Object) new int[]{3, 1, 7})
        );
    }
    @ParameterizedTest
    @MethodSource("arrayPlusArray")
    void task1Test(int[] arr1, int[] arr2) {
        Assertions.assertEquals(Arrays.toString(arr2), Arrays.toString(Main.task1(arr1)));
    }





    static Stream<Arguments> arrayPlusBul() {
        return Stream.of(
                Arguments.of((Object) new int[]{1, 1, 1, 4, 4, 1, 4, 4}, true),
                Arguments.of((Object) new int[]{1, 1, 1, 1, 1, 1}, false),
                Arguments.of((Object) new int[]{4, 4, 4, 4}, false),
                Arguments.of((Object) new int[]{1, 4, 4, 1, 1, 4, 3}, false)
        );
    }
    @ParameterizedTest
    @MethodSource("arrayPlusBul")
    void task2Test(int[] arr, boolean b) {
        Assertions.assertEquals(b, Main.task2(arr));
    }


    
}