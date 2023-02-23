package E01_WorkingWithAbstraction.E00_Test;

public class TestMain {
    enum TimeUnit {
        MILLISECOND(1),
        SECOND(MILLISECOND, 1000),
        MINUTE(SECOND, 60),
        HOUR(MINUTE, 60),
        DAY(HOUR, 24);

        private long milliseconds;

        TimeUnit(long milliseconds) {

            this.milliseconds = milliseconds;
        }

        TimeUnit(TimeUnit baseUnit, int multiplier) {
            this(baseUnit.milliseconds * multiplier);
        }
    }


    enum TrafficLightColors {
        GREEN,
        YELLOW,
        RED

    }

    // static променлива - всички инстанции на дадения клас имат еднаква променлива стойност
    // static final (статична променлива) Пример: static final int MIN_PERSON_AGE = 18;

    public static void main(String[] args) {
        TimeUnit timeUnit = TimeUnit.SECOND;
        TimeUnit otherTimeUnit = TimeUnit.MINUTE;
    }
}
