package tech_tasks.primitives;

import helpers.MathUtils;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

@DisplayName("Check arithmetical operations")
@Tag("mathTests")
@Epic("Java Fundamentals")
@Feature("Arithmetic Operators")
public class BigDecimalMathTests {

    @Test
    @DisplayName("Should convert string to double and add values without rounding mode")
    void addBigDecimalProblemWithoutRoundingModeTest() {
        String a = "Total: -9.99";
        double b = 9.98;

        BigDecimal result = MathUtils.addBigDecimalWithoutRoundingMode(a, b);
        BigDecimal expected = new BigDecimal("-0.010000");

        MathUtils.assertEqualsBigDecimal(expected, result);
    }

    @Test
    @DisplayName("Should convert string to double and add values with rounding mode")
    void addBigDecimalProblemWithRoundingModeTest() {
        Long a = 1L;
        String b = "Total: $0.4930";

        BigDecimal result = MathUtils.addBigDecimalWithRoundingMode(a, b, RoundingMode.UP);
        BigDecimal expected = new BigDecimal("1.50");

        MathUtils.assertEqualsBigDecimal(expected, result);
    }

    @Test
    @DisplayName("Should convert string to double and subtract values without rounding mode")
    void subtractDecimalProblemWithoutRoundingModeTest() {
        String a = "Total: 1.5049";
        String b = "Total: $0.4930";

        BigDecimal result = MathUtils.subtractBigDecimalWithoutRoundingMode(a, b);
        BigDecimal expected = new BigDecimal("1.0119");

        MathUtils.assertEqualsBigDecimal(expected, result);
    }

    @Test
    @DisplayName("Should convert string to double and subtract values with rounding mode")
    void subtractDecimalProblemWithRoundingModeTest() {
        String a = "Total: 1.5049";
        String b = "Total: $0.4930";

        BigDecimal result = MathUtils.subtractBigDecimalWithRoundingMode(a, b, RoundingMode.UP);
        BigDecimal expected = new BigDecimal("1.02");

        MathUtils.assertEqualsBigDecimal(expected, result);
    }

    @Test
    @DisplayName("Should convert string to double and multiply values without rounding mode")
    void multiplyDecimalProblemWithoutRoundingModeTest() {
        String a = "Total: 1.5049";
        String b = "Total: $0.4930";

        BigDecimal result = MathUtils.multiplyBigDecimalWithoutRoundingMode(a, b);
        BigDecimal expected = new BigDecimal("0.74191570");

        MathUtils.assertEqualsBigDecimal(expected, result);
    }

    @Test
    @DisplayName("Should convert string to double and multiply values with rounding mode")
    void multiplyDecimalProblemWithRoundingModeTest() {
        String a = "Total: 1.5049";
        double b = 0.4930;

        BigDecimal result = MathUtils.multiplyBigDecimalWithRoundingMode(a, b, RoundingMode.DOWN);
        BigDecimal expected = new BigDecimal("0.74");

        MathUtils.assertEqualsBigDecimal(expected, result);
    }

    @Test
    @DisplayName("Should convert string to double and divide values without rounding mode")
    void divideDecimalProblemWithoutRoundingModeTest() {
        String a = "Total: 2";
        String b = "Total: $2";

        BigDecimal result = MathUtils.divideBigDecimalWithoutRoundingMode(a, b);
        BigDecimal expected = new BigDecimal("1");

        MathUtils.assertEqualsBigDecimal(expected, result);
    }

    @Test
    @DisplayName("Should convert string to double and divide values with rounding mode")
    void divideDecimalProblemWithRoundingModeTest() {
        String a = "Total: 1.5049";
        double b = 0.4930;

        BigDecimal result = MathUtils.divideBigDecimalWithRoundingMode(a, b, RoundingMode.UP);
        BigDecimal expected = new BigDecimal("3.06");

        MathUtils.assertEqualsBigDecimal(expected, result);
    }
}
