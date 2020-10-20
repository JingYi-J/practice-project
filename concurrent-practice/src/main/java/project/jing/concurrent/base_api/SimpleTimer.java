package project.jing.concurrent.base_api;

/**
 * 用Thread.sleep实现简单的倒计时器
 */
public class SimpleTimer {
    private static int count;

    public static void main(String[] args) {
        count = args.length >= 1 ? Integer.valueOf(args[0]) : 60;
        int remaining;

        while(true) {
            remaining = countDown();
            if (0 == remaining) {
                break;
            }else {
                System.out.println("Remaining " + count + " second(s)");
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        System.out.println("Done.");
    }

    private static int countDown(){
        return count--;
    }
}
