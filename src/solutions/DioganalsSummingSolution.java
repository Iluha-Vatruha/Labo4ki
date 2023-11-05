package solutions;

import domain.Matrix;

public class DioganalsSummingSolution implements ISolutionMatrix{

    @Override
    public void description() {
        System.out.println("Определить общую сумму элементов диагоналей квадратной двумерной матрицы");
    }
    @Override
    public double solve(short[][] matrix) {
        System.out.print("Общая сумма диагоналей: ");
        double result = Matrix.dioSum(matrix);
        System.out.println(String.format("%.2f",result));
        return result;
    }
}
