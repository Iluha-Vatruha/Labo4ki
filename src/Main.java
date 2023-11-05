import domain.Matrix;
import domain.Text;
import solutions.*;

public class Main {
    public static void main(String[] args) {

        short[][] dioganalsTask = {
                {1, 2},
                {2, 3}
        };
        short[][] geometricTask = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        short[][] popularMatrixTask = {
                {1, -25, 3},
                {4, 25, 6},
                {7, 9, -25}
        };
        String s = "Lol";

        ReplaceVowelsSolution replaceVowelsSolution = new ReplaceVowelsSolution();
        replaceVowelsSolution.description();
        replaceVowelsSolution.solve(s);

        DioganalsSummingSolution solutionDioganals = new DioganalsSummingSolution();
        solutionDioganals.description();
        solutionDioganals.solve(dioganalsTask);

        GeometricMultiplicationSolution solutionGeometric = new GeometricMultiplicationSolution ();
        solutionGeometric.description();
        solutionGeometric.solve(geometricTask);

        MatrixPopularValuesSolution solutionPopular = new MatrixPopularValuesSolution();
        solutionPopular.description();
        solutionPopular.solve(popularMatrixTask);
    }

}