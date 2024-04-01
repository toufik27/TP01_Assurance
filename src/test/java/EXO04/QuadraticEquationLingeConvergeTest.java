package EXO04;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import EXO04.QuadraticEquation;
public class QuadraticEquationLingeConvergeTest {

    @Test
    public void testSolveWithGenericCoefficients() {
        double a = 2, b = -5, c = 3;
        double[] roots = QuadraticEquation.solve(a, b, c);
        assertArrayEquals(new double[]{1.5, 1}, roots, 0.0001);
    }

    @Test
    public void testSolveWithAEquallingZero() {
        double a = 0, b = 3, c = -4;
        assertThrows(IllegalArgumentException.class, () -> QuadraticEquation.solve(a, b, c));
    }

    @Test
    public void testSolveWithNegativeDelta() {
        double a = 1, b = 2, c = 5;
        assertNull(QuadraticEquation.solve(a, b, c));
    }

    @Test
    public void testSolveWithZeroDelta() {
        double a = 1, b = -6, c = 9;
        assertArrayEquals(new double[]{3}, QuadraticEquation.solve(a, b, c), 0.0001);
    }

    @Test
    public void testSolveWithPositiveDelta() {
        double a = 1, b = -3, c = 2;
        assertArrayEquals(new double[]{2, 1}, QuadraticEquation.solve(a, b, c), 0.0001);
    }

    @Test
    public void testSolveWithDecimalCoefficients() {
        double a = 0.5, b = 1.5, c = 1.0;
        double[] roots = QuadraticEquation.solve(a, b, c);
        assertArrayEquals(new double[]{-1, -1}, roots, 0.0001);
    }

    @Test
    public void testSolveWithNegativeCoefficients() {
        double a = -1, b = -4, c = -3;
        double[] roots = QuadraticEquation.solve(a, b, c);
        assertArrayEquals(new double[]{-1, -3}, roots, 0.0001);
    }


}

