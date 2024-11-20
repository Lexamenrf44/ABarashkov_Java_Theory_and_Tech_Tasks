package helpers;

import io.qameta.allure.Step;
import org.assertj.core.api.Assertions;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtils {

    @Step ("Addition without rounding mode")
    public static BigDecimal addBigDecimalWithoutRoundingMode(Object a, Object b) {
        return convertToBigDecimal(a).add(convertToBigDecimal(b));
    }

    @Step ("Addition with rounding mode")
    public static BigDecimal addBigDecimalWithRoundingMode(Object a, Object b, RoundingMode roundingMode) {
        return convertToBigDecimal(a).add(convertToBigDecimal(b)).setScale(2, roundingMode);
    }

    @Step ("Subtraction without rounding mode")
    public static BigDecimal subtractBigDecimalWithoutRoundingMode(Object a, Object b) {
        return convertToBigDecimal(a).subtract(convertToBigDecimal(b));
    }

    @Step ("Subtraction with rounding mode")
    public static BigDecimal subtractBigDecimalWithRoundingMode(Object a, Object b, RoundingMode roundingMode) {
        return convertToBigDecimal(a).subtract(convertToBigDecimal(b)).setScale(2, roundingMode);
    }

    @Step ("Multiplication without rounding mode")
    public static BigDecimal multiplyBigDecimalWithoutRoundingMode(Object a, Object b) {
        return convertToBigDecimal(a).multiply(convertToBigDecimal(b));
    }

    @Step ("Multiplication with rounding mode")
    public static BigDecimal multiplyBigDecimalWithRoundingMode(Object a, Object b, RoundingMode roundingMode) {
        return convertToBigDecimal(a).multiply(convertToBigDecimal(b)).setScale(2, roundingMode);
    }

    @Step ("Division without rounding mode")
    public static BigDecimal divideBigDecimalWithoutRoundingMode(Object a, Object b) {
        return convertToBigDecimal(a).divide(convertToBigDecimal(b));
    }

    @Step ("Division with rounding mode")
    public static BigDecimal divideBigDecimalWithRoundingMode(Object a, Object b, RoundingMode roundingMode) {
        return convertToBigDecimal(a).divide(convertToBigDecimal(b), 2, roundingMode);
    }

    @Step("Comparing the sums of {a} and {b}")
    public static void assertEqualsBigDecimal(Object a, Object b) {
        Assertions.assertThat(convertToBigDecimal(a).compareTo(convertToBigDecimal(b)))
                .withFailMessage(a + " is not equal to " + b)
                .isEqualTo(0);
    }

    private static String sanitizeInput(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Input string is null or empty");
        }

        String sanitized = input.replaceAll("[^\\d.-]", "");
        if (sanitized.isEmpty() || !sanitized.matches("-?\\d+(\\.\\d+)?")) {
            throw new IllegalArgumentException("Invalid numeric value: " + input);
        }
        return sanitized;
    }

    public static BigDecimal convertToBigDecimal(Object value) {
        return switch (value.getClass().getSimpleName()) {
            case "String" -> new BigDecimal(sanitizeInput(value.toString()));
            case "Double" -> BigDecimal.valueOf((Double) value);
            case "BigDecimal" -> (BigDecimal) value;
            case "Integer" -> BigDecimal.valueOf((Integer) value);
            case "Long" -> BigDecimal.valueOf((Long) value);
            default -> throw new IllegalArgumentException("Unknown type: " + value.getClass().getSimpleName());
        };
    }

    @Step("Assert arithmetical results")
    public static void assertOperationEquals(BigDecimal expected, BigDecimal result) {
        assertEquals(expected, result, "Test failed! Expected: " + expected + " but got: " + result);
        System.out.println("Test passed! Expected: " + result);
    }
}
