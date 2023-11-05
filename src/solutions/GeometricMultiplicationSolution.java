package solutions;

import domain.Matrix;

public class GeometricMultiplicationSolution implements ISolutionMatrix{
    @Override
    public void description() {
        System.out.println("Определить среднее геометрическое значение элементов квадратной двумерной матрицы");
    }
    @Override
    public double solve(short[][] matrix) {
        System.out.print("Среднее геометрическое значение: ");
        double result = Matrix.geoMult(matrix);
        System.out.println(result);
        return result;
    }
}
