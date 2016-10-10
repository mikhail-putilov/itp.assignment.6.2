package ru.innopolis.mputilov;

/**
 * Created by mputilov on 02/10/16.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        //initialize
        GenericArray<Integer> arr = new GenericArray<>(3);
        for (int i = 0; i < arr.length(); i++) {
            arr.set(i, i);
        }
        //print everyting out
        for (int i = 0; i < arr.length(); i++) {
            System.out.println(arr.get(i));
        }
        //show exception case
        System.out.println("Example of exception if overflow occurs:");
        Thread.sleep(200);
        System.out.println(arr.get(4));
    }
}
