package project.jing.concurrent.base_api;

public class RequestIdGeneratorSafeTest {

    public static void main(String[] args) {
        int num = args.length > 0 ? Short.valueOf(args[0]) : Runtime.getRuntime().availableProcessors();

        Thread[] workThread = new Thread[num];
        for (int i = 0; i < num; i++) {
            workThread[i] = new WorkerThread(i, 10);
        }

        for (int i = 0; i < num; i++) {
            workThread[i].start();
        }
    }

    static class WorkerThread extends Thread{
        private final int requestCount;

         public WorkerThread(int id, int requestCount) {
             super("worker-" + id);
             this.requestCount = requestCount;
         }

        @Override
        public void run() {
            int i = requestCount;
            String requestId;

            RequestIdGeneratorSafe requestIdGenerator = RequestIdGeneratorSafe.getInstance();

            while (i-- > 0) {
                requestId = requestIdGenerator.nextId();
                processRequest(requestId);
            }

        }

        private void processRequest(String requestId) {
            System.out.printf("%s got requestId : %s %n", Thread.currentThread().getName(), requestId);
        }
    }
}


