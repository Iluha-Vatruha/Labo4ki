package solutions;

import domain.Matrix;

public class MatrixPopularValuesSolution implements ISolutionMatrix{
    @Override
    public void description() {
        System.out.println("Найти самое часто встречающееся значение квадратной двумерной матрицы");
    }
    @Override
    public double solve(short[][] matrix) {
        double result = Matrix.matrixPop(matrix);
        System.out.println("Самое часто встречающееся значение: ");
        System.out.println(String.format("%.0f",result ));
        return result;
    }
}
