package MyPractice;
import java.util.Random;

class RandomNumberThread extends Thread {
    public void run() {
        Random random = new Random();
            int number = random.nextInt(100);  // Generate a random number between 0 and 99
            System.out.println("Generated number: " + number);
            if (number % 2 == 0) {
                EvenThread evenThread = new EvenThread(number);
                evenThread.start();
            } else {
                OddThread oddThread = new OddThread(number);
                oddThread.start();  
            }
        
    }
}

class EvenThread extends Thread {
    private int number;

    public EvenThread(int number) {
        this.number = number;
    }

    public void run() {
        int square = number * number;
        System.out.println("Even thread: Square of " + number + " is " + square);
    }
}

class OddThread extends Thread {
    private int number;

    public OddThread(int number) {
        this.number = number;
    }

    public void run() {
        int cube = number * number * number;
        System.out.println("Odd thread: Cube of " + number + " is " + cube);
    }
}

public class RandomNumberGenerator {
    public static void main(String[] args) {
        RandomNumberThread randomNumberThread = new RandomNumberThread();
        randomNumberThread.start(); 
    }
}
