public final class MaxMinFromABCDvTwo {
    public static int findMax (int a, int b, int c, int d){
        // т.к. по сути нам объект не нужен, то делаем метод static
        // а класс final
        int max;
        if ((a > b) && (a > c) && (a > d)){ // сравниваем a  с тремя другими числами
            max = a;                        // если условие выполнилось max = a, если нет
        }else if ((b>c) && (b>d)){          // т.к. a не максимальное -> max b, c или d
            max = b;
        }else if ( c > d) {                 // если и b не максимальное -> сравниваем только c и d
            max = c;
        }else {
            max = d;                        // если ни одно из условий не выполнилось, то max = d
        }
        return max;
    }
    public static double findMax (double a, double b, double c, double d){
        double max;
        if ((a > b) && (a > c) && (a > d)){
            max = a;
        }else if ((b>c) && (b>d)){
            max = b;
        }else if ( c > d) {
            max = c;
        }else {
            max = d;
        }
        return max;
    }

    public static int findMin (int a, int b, int c, int d){
        int min;
        if ((a < b) && (a < c) && (a < d)){
            min = a;
        }else if ((b<c) && (b<d)){
            min = b;
        }else if ( c < d) {
            min = c;
        }else {
            min = d;
        }
        return min;
    }
    public static double findMin (double a, double b, double c, double d){
        double min;
        if ((a < b) && (a < c) && (a < d)){
            min = a;
        }else if ((b < c) && (b < d)){
            min = b;
        }else if ( c < d) {
            min = c;
        }else {
            min = d;
        }
        return min;
    }
}
