package liquidburn1.relicsPlugin.Utils;

import java.util.concurrent.ThreadLocalRandom;

public class RandomRange {

    private final double min;
    private final double max;

    // Constructor
    public RandomRange(double min, double max) {
        this.min = min;
        this.max = max;
    }


    public double getRandom() {
        if (min == max) {
            return min;
        }
        return ThreadLocalRandom.current().nextDouble(min, max);
    }


    public int getRandomInt() {
        if (min == max) {
            return (int) min;
        }
        return ThreadLocalRandom.current().nextInt((int) min, (int) max + 1);
    }


}
