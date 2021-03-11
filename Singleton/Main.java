package Singleton;

public class Main {

    public static void main(String... arguments) {
        Thread firstSingletonThread = new Thread(new FirstSingletonThread());
        Thread secondSingletonThread = new Thread(new SecondSingletonThread());

        firstSingletonThread.start();
        secondSingletonThread.start();
    }

    static class FirstSingletonThread implements Runnable {

        @Override
        public void run() {
            Singelton singelton = new Singelton ();
           System.out.println(singleton.getValue());
        }
    }
    static class SecondSingletonThread implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("Another text");
            System.out.println(singleton.getValue());
        }
    }
}
