import java.util.Objects;

public class Dragon {
    public static final int FIRST_PERIOD = 200;
    public static final int SECOND_PERIOD = 300;
    public static final int AMOUNT_HEADS_AT_FIRST_PERIOD_A_YEAR = 3;
    public static final int AMOUNT_HEADS_AT_SECOND_PERIOD_A_YEAR = 2;
    public static final int AMOUNT_HEADS_AFTER_SECOND_PERIOD_A_YEAR = 1;


    private int age;
    private int heads = 3;
    private int eyes = 6;

    public Dragon() {
    }

    public Dragon(int age) {
        this.age = age;
    }

    public int countHeads() {
        if (age >= 0) { //проверяем валидность введенного возраста
            if (age < FIRST_PERIOD) {
                heads += age * AMOUNT_HEADS_AT_FIRST_PERIOD_A_YEAR;
            } else if (age < SECOND_PERIOD) {
                heads += (age - FIRST_PERIOD) * AMOUNT_HEADS_AT_SECOND_PERIOD_A_YEAR + FIRST_PERIOD
                        * AMOUNT_HEADS_AT_FIRST_PERIOD_A_YEAR;
            }else {
                heads +=age-SECOND_PERIOD + FIRST_PERIOD*AMOUNT_HEADS_AT_FIRST_PERIOD_A_YEAR
                        + (SECOND_PERIOD-FIRST_PERIOD) * AMOUNT_HEADS_AT_SECOND_PERIOD_A_YEAR;
            }

        } else {         // если возраст не валиден возвращаем
            heads = -1; // количество голов -1, чтобы пользователь мог узнать что возраст не валиден, но
            // при этом не бросать эксепшен
        }
        return heads;
    }

    public int countEyes(){
        eyes = countHeads() * 2;
        return eyes;
    }
    /*
    Для всех полей класса предусматриваем только setters
    кроме поля age. Но чтобы избезать несоответствия возраста дракона
    и количества голов в сеттере вызываем метов countHeads()
     */

    public static int getFirstPeriod() {
        return FIRST_PERIOD;
    }

    public static int getSecondPeriod() {
        return SECOND_PERIOD;
    }

    public static int getAmountHeadsAtFirstPeriodAYear() {
        return AMOUNT_HEADS_AT_FIRST_PERIOD_A_YEAR;
    }

    public static int getAmountHeadsAtSecondPeriodAYear() {
        return AMOUNT_HEADS_AT_SECOND_PERIOD_A_YEAR;
    }

    public static int getAmountHeadsAfterSecondPeriodAYear() {
        return AMOUNT_HEADS_AFTER_SECOND_PERIOD_A_YEAR;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        countHeads();
        countEyes();
    }

    public int getHeads() {
        return heads;
    }

    public int getEyes() {
        return eyes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dragon)) return false;
        Dragon dragon = (Dragon) o;
        return age == dragon.age &&
                heads == dragon.heads &&
                eyes == dragon.eyes;
    }

    @Override
    public int hashCode() {

        return Objects.hash(age, heads, eyes);
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "age=" + age +
                ", heads=" + heads +
                ", eyes=" + eyes +
                '}';
    }
}
