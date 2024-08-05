package ICE3Pack;
import java.util.Scanner;

public class TestCounter {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int loopCount;
        int num1, num2;

        do {

            System.out.print("Enter a number between 1 and 10: ");
            loopCount = keyboard.nextInt();

        } while(loopCount < 1 || loopCount > 10);

        for(int i = 0; i < loopCount; i++) {
            Counter.incrementCount();
        }

        System.out.printf("Counter: %d\n", Counter.getInstanceCount());

        System.out.print("Enter two numbers separated by space: ");
        num1 = keyboard.nextInt();
        num2 = keyboard.nextInt();

        for(int i = num1, j = num2; i < num1 + loopCount; i++, j++) {

            System.out.printf("%d * %d = %d\n", i, j, Counter.timesTwo(i, j));

        }

        keyboard.close();

    }
}
