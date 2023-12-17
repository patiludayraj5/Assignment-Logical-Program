import java.util.Scanner;

public class Stopwatch {

    static Scanner sc=new Scanner(System.in);
    private long startTime = 0;
    private long stopTime = 0;
    private boolean running = false;

    public void start() {
        this.startTime = System.currentTimeMillis();
        this.running = true;
    }
    public void stop() {
        this.stopTime = System.currentTimeMillis();
        this.running = false;
    }
    public long getElapsedTime() {

        long elapsed;
        if (running) {
            elapsed = (System.currentTimeMillis() - startTime);
        }
        else {
            elapsed = (stopTime - startTime);
        }
        return elapsed;
    }public long getElapsedTimeSecs() {
        long elapsed;
        if (running) {
            elapsed = ((System.currentTimeMillis() - startTime) / 1000);
        }
        else {
            elapsed = ((stopTime - startTime) / 1000);
        }
        return elapsed;
    }
    public static void main(String[] args) {
        Stopwatch s = new Stopwatch();
        System.out.println("press any no to START!");
        int n=sc.nextInt();
        if (n>=0) {
            s.start();
        }else {
            System.out.println("Invalid Input!");
            return;
        }
        //code you want to time goes here
        System.out.println("Press any no and then press 'ENTER' to STOP!");
        int m=sc.nextInt();
        if (m>0) {
            s.stop();
        }else {
            System.out.println("Invalid Input!");
        }
        System.out.println("elapsed time in seconds: "+s.getElapsedTimeSecs());
        System.out.println("elapsed time in milliseconds: " + s.getElapsedTime());
    }
}
