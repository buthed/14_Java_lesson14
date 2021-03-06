import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

class MainTest {


    @Test
    void task1Test() {
    }



    static Stream<Arguments> arrayPlusBul() {
        return Stream.of(
                Arguments.of((Object) new int[]{1, 1, 1, 4, 4, 1, 4, 4}, true),
//                Arguments.of((Object) new int[]{1, 1, 1, 1, 1, 1}, false),
//                Arguments.of((Object) new int[]{4, 4, 4, 4}, false),
                Arguments.of((Object) new int[]{1, 4, 4, 1, 1, 4, 3}, false)
        );
    }

    @ParameterizedTest
    @MethodSource("arrayPlusBul")
     void task2Test(int[] arr, boolean b) {
        Assertions.assertEquals(b, Main.task2(arr));
    }


    
}