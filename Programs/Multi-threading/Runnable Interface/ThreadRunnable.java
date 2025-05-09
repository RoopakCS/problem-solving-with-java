public class ThreadRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ThreadRunnable threadRunnable1 = new ThreadRunnable();
        Thread thread1 = new Thread(threadRunnable1); // Passing the object of the user defined class
        thread1.start();

        ThreadRunnable threadRunnable2 = new ThreadRunnable();
        Thread thread2 = new Thread(threadRunnable2); // Passing the object of the user defined class
        thread2.start();

        ThreadRunnable threadRunnable3 = new ThreadRunnable();
        Thread thread3 = new Thread(threadRunnable3); // Passing the object of the user defined class
        thread3.start();
    }
}
