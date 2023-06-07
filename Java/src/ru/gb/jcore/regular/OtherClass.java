package ru.gb.jcore.regular;

public class OtherClass {
    /**
     * @param a слогаемое
     * @param b слогаемое
     * @return сумма
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * @param a делимое
     * @param b делитель
     * @return частное
     */
    public static int div(int a, int b){
        return b == 0 ? a : a / b;
    }

    /**
     * @param a множитель
     * @param b множитель 
     * @return умножение
     */
    public static int mul(int a , int b){
        return a * b;
    }

    /**
     * @param a уменьшаемое
     * @param b частное
     * @return разность
     */
    public static int sub (int a, int b){
        return a - b;
    }
}
