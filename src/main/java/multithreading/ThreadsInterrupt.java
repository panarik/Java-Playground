package multithreading;

public class ThreadsInterrupt {

    public static void main(String[] args) throws InterruptedException {

        //первый вариант
        //daemon1();

        //второй вариант
        //daemon2();

    }

    private static void daemon2() throws InterruptedException {

        Thread t = new Thread(() -> {
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    System.out.println("Tick");
                    Thread.sleep(500);
                    System.out.println("Tack");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });
        t.start();
        Thread.sleep(5000);
        t.interrupt();
        System.out.println("Finished");
    }

    private static void daemon1() throws InterruptedException {

        Thread t = new Thread(() -> {
            while (true) {
                try {
                    System.out.println("Tick");
                    Thread.sleep(500);
                    System.out.println("Tack");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.setDaemon(true);
        t.start();
        Thread.sleep(5000);
        System.out.println("Finished");

    }

}
