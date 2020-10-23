package project.jing.concurrent.cases.matrix;

import java.util.Date;

public class ParallelGroupMultiplierTest {

    public static void main(String[] args) {

        int rows = 2000;
        int columns = 2000;

        double m1[][] = MatrixGenerator.generate(rows, columns);
        double m2[][] = MatrixGenerator.generate(rows, columns);
        double result[][] = new double[m1.length][m2[0].length];

        Date start = new Date();
        ParallelGroupMultiplier.multiply(m1, m2, result);
        Date end = new Date();
        System.out.printf("Parallel Group : %d s %n", (end.getTime() - start.getTime()));

    }
}
