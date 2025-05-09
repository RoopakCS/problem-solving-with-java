public class MultiThread extends java.lang.Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        MultiThread multiThread1 = new MultiThread(); // className objectName = new className();
        multiThread1.start();

        MultiThread multiThread2 = new MultiThread();
        multiThread2.start();

        MultiThread multiThread3 = new MultiThread();
        multiThread3.start();
    }

}
