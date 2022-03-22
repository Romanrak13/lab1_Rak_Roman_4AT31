package day_4.thread;

public class Main {

    public static String ball;

    public static void main(String[] args) {
        //Make two threads and connect them to play a Ping-Pong game.
        new PingPong("ping").start();
        new PingPong("pong").start();
    }
}