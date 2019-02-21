public final class MaxMinFromABCD {
    public static int findMax (int a, int b, int c, int d){
        int max = a;
        if (max < b){
            max = b;
        }
        if (max < c){
            max = c;
        }
        if (max < d){
            max = d;
        }

      return max;
    }

    public static double findMax (double a, double b, double c, double d){
        double max = a;
        if (max < b){
            max = b;
        }
        if (max < c){
            max = c;
        }
        if (max < d){
            max = d;
        }

        return max;
    }

    public static int findMin (int a, int b, int c, int d){
        int min = a;
        if (min > b){
            min = b;
        }
        if (min > c){
            min = c;
        }
        if (min > d){
            min = d;
        }

        return min;
    }

    public static double findMin (double a, double b, double c, double d){
        double min = a;
        if (min > b){
            min = b;
        }
        if (min > c){
            min = c;
        }
        if (min > d){
            min = d;
        }

        return min;
    }

}
