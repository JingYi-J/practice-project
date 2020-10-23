package project.jing.concurrent.cases.matrix;

import java.util.ArrayList;
import java.util.List;

public class ParallelRowMultiplier {

    public static void multiply(double[][] m1, double[][] m2, double[][] result) {
        List<Thread> threads = new ArrayList<Thread>();

        int row1 = m1.length;

        for (int i = 0; i < row1; i++) {
            RowMultiplierTask task = new RowMultiplierTask(result, m1, m2, i);
            Thread t = new Thread(task);
            t.start();
            threads.add(t);

            if (threads.size() % 10 == 0) {
                waitForThreads(threads);
            }
        }
    }

    private static void waitForThreads(List<Thread> threads){
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        threads.clear(); }
}
