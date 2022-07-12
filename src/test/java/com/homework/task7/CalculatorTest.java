package com.homework.task7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CalculatorTest {
    double actual1 = 4.8758;
    double actual2 = 6.238;
    private final Operation operation = new Operation(actual1, actual2);
    private final String TEXT = "После вызова конструктора %s число должно быть равно %f";

    @Test
    public void checkFirstNumInit() {
        assertEquals(String.format(TEXT, "первое", actual1), operation.getFirstNum(), actual1, 0);
    }

    @Test
    public void checkSecondNumInit() {
        assertEquals(String.format(TEXT, "второе", actual2), operation.getSecondNum(), actual2, 0);
    }

    @Test
    public void checkAddition() {
        double sum = actual1 + actual2;
        assertEquals("Сумма двух чисел должна быть равной " + sum, operation.add(), sum, 0);
    }

    @Test
    public void checkSubtraction() {
        double sub = actual1 - actual2;
        assertEquals("Разница двух чисел должна быть равной " + sub, operation.subtract(), sub, 0);
    }

    @Test
    public void checkMultiplication() {
        double multiplication = actual1 * actual2;
        assertEquals("Произведение двух чисел должно быть равно " + multiplication,
                operation.multiply(), multiplication, 0);
    }

    @Test
    public void checkDivision() {
        double division = actual1 / actual2;
        assertEquals("Частное двух чисел должно быть равно " + division,
                operation.divide(), division, 0);
    }

    @Test
    public void shouldBeDivisionByZeroException() {
        Operation errorOperation = new Operation(4, 0);
        try {
            errorOperation.divide();
            fail("Должно быть выброшено исключение при делении на 0");
        }
        catch (ArithmeticException arithmeticException) {
            String message = "Деление на ноль невозможно!";
            assertEquals("Выброшенное исключение должно выдавать сообщение '" + message + "'",
                    message, arithmeticException.getMessage());
        }
    }
}
