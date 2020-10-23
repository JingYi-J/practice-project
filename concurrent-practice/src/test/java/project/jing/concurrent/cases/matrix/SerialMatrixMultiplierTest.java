package project.jing.concurrent.cases.matrix;


import java.util.Date;

public class SerialMatrixMultiplierTest {


    public static void main(String[] args) {

        int rows = 2000;
        int columns = 2000;

        double matrix1[][] = MatrixGenerator.generate(rows, columns);
        double matrix2[][] = MatrixGenerator.generate(rows, columns);
        double resultSerial[][]= new double[matrix1.length][matrix2[0].length];

        Date start=new Date();
        SerialMatrixMultiplier.multiply(matrix1, matrix2, resultSerial);
        Date end=new Date();
        System.out.printf("Serial: %d%n ",(end.getTime()-start.getTime())  );    }

}
