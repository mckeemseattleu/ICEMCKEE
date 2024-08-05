package ICE5Pack;
public class FameMoneyHappiness {

    public static enum FMH {
        FAME,
        MONEY,
        HAPPINESS
    }

    private FMH value;
    private static FMH lastFMH = FMH.FAME;

    public FameMoneyHappiness() {

        switch (lastFMH) {
            case FAME:
                value = FMH.MONEY;
                break;
            case MONEY:
                value = FMH.HAPPINESS;
                break;
            case HAPPINESS:
                value = FMH.FAME;
                break;
        }

        lastFMH = value;

    }

    public FMH getValue() {
        return this.value;
    }

    public static void main(String[] args) {

        FameMoneyHappiness fmh1 = new FameMoneyHappiness();
        FameMoneyHappiness fmh2 = new FameMoneyHappiness();
        FameMoneyHappiness fmh3 = new FameMoneyHappiness();
        FameMoneyHappiness fmh4 = new FameMoneyHappiness();

        System.out.println(fmh1.getValue());
        System.out.println(fmh2.getValue());
        System.out.println(fmh3.getValue());
        System.out.println(fmh4.getValue());
    }

}
