public class Main {
    /* Условие задачи :
    * Дракон рождается с тремя гововами
    * первые 200 лет каждый год у него вырастает по 3 головы, последущие 100 лет
    * (от 200 до 300 лет) у него каждый год вырастает по 2 головы, а после 300 лет
    * каждый год у него вырастает одна голова
    *
    * Определить количество голов и глаз дракона в заданное количество лет
    * */

    public static void main(String[] args) {
        Dragon dragon = new Dragon(100);
        System.out.println("Dragon's age is '" + dragon.getAge());
        System.out.println("Dragon has " + dragon.countHeads() + " heads");

    }
}
