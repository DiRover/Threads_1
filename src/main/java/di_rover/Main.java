package di_rover;

public class Main {
    public static void main(String[] args) {

        ThreadGroup group = new ThreadGroup("Dream team");

        Thread threadHarry = new Thread(group, new MyThread(), "Harry");
        Thread threadJohn =  new Thread(group, new MyThread(), "John");
        Thread threadSam =  new Thread(group, new MyThread(), "Sam");
        Thread threadTaylor =  new Thread(group, new MyThread(), "Taylor");

        threadHarry.start();
        threadJohn.start();
        threadSam.start();
        threadTaylor.start();

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Завершаю все потоки.");

        group.interrupt();

    }
}