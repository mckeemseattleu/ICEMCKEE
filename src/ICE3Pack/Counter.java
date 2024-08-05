package ICE3Pack;
public class Counter {

    private static int instanceCount = 0;

    public static int timesTwo(int val1, int val2) {
        return val1 * val2;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    public static void incrementCount() {
        instanceCount++;
    }

}
