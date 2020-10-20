package project.jing.concurrent.classic_case.matrix;

import java.util.Random;

public class MatrixGenerator {

    public static double[][] generate(int rows, int columns) {
        double[][] matrix = new double[rows][columns];

        Random random = new Random();
        for (int r = 0; r < rows; r++) {
            for (int l = 0; l < columns; l++) {
                matrix[r][l] = random.nextDouble() * 10;
            }
        }

        return matrix;
    }
}
