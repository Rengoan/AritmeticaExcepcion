package test;

import static aritmetica.Aritmetica.division;

public class Test {

    public static void main(String[] args) {
        int res = 0;

        try {
            res = division(10, 0);

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
