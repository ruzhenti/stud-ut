package lesson3;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

//import lesson3.MainHW;


class MainHWTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }


    @Test
    @DisplayName("1. Проверка на четность")
    void testEvenNumber() {
        assertTrue(MainHW.evenOddNumber(4));
    }

    @Test
    @DisplayName("2. Проверка на нечетность")
    void testOddNumber() {
        assertFalse(MainHW.evenOddNumber(5));
    }

    @Test
    @DisplayName("3. входит в интервал")
    void numberInInterval() {
        assertTrue(MainHW.numberInInterval(25));
    }

    @ParameterizedTest
    @DisplayName("4. не входит в интервал")
    @ValueSource(ints = {24, 101})
    void numberInInterval(int number) {
        assertFalse(MainHW.numberInInterval(number));
    }
}