package project.jing.concurrent.base_api;

public class ThreadApi {

    public static void main(String[] args) {
        Thread current = Thread.currentThread();
        String currentThreadName = current.getName();
        System.out.printf("The main method was executed by thread:%s\n", currentThreadName);

        Helper helper = new Helper("Java Thread AnyWhere");
        helper.run();
    }

    static class Helper implements Runnable {

        private final String message;

        public Helper(String message) {
            this.message = message;
        }

        @Override
        public void run() {
            doSomething(message);
        }

        private void doSomething(String message) {
            Thread current = Thread.currentThread();
            String currentThreadName = current.getName();

            System.out.printf("The doSomething method was executed by thread:%s\n", currentThreadName);
            System.out.println("Do Something with " + message);
        }
    }
}
