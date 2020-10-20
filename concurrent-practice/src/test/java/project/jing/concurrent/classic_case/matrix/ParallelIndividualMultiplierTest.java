package project.jing.concurrent.classic_case.matrix;

import java.util.Date;

public class ParallelIndividualMultiplierTest {

    public static void main(String[] args) {

        int rows = 500;
        int columns = 500;

        double m1[][] = MatrixGenerator.generate(rows, columns);
        double m2[][] = MatrixGenerator.generate(rows, columns);
        double result[][] = new double[m1.length][m2[0].length];

        Date start = new Date();
        ParallelIndividualMultiplier.multiply(m1, m2, result);
        Date end = new Date();
        System.out.printf("Parallel Individual : %d s %n", (end.getTime() - start.getTime()) / 1000);

    }
}
