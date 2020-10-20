package project.jing.concurrent.classic_case.matrix;

/**
 * 矩阵相乘
 * 串行
 */
public class SerialMatrixMultiplier {

    public static void multiply(double[][] m1, double[][] m2, double[][] result) {

        int rows1 = m1.length;
        int columns1 = m1[0].length;
        int columns2 = m2[0].length;

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < columns1; k++) {
                    result[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
    }
}
