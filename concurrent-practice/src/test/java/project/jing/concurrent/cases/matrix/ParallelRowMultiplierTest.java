package project.jing.concurrent.cases.matrix;

import java.util.Date;

public class ParallelRowMultiplierTest {

    public static void main(String[] args) {
        int rows = 500;
        int columns = 500;

        double m1[][] = MatrixGenerator.generate(rows, columns);
        double m2[][] = MatrixGenerator.generate(rows, columns);
        double result[][] = new double[m1.length][m2[0].length];

        Date start = new Date();
        ParallelRowMultiplier.multiply(m1, m2, result);
        Date end = new Date();
        System.out.printf("Parallel Row : %d s %n", (end.getTime() - start.getTime()) / 1000);

    }
}
