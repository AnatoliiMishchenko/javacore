
package ru.gb.jcore.regular;

/**
 *Декаратор для для метода
 */
public class Decorator {
    /**
     * @param a число для вывода
     * @return строка с коментарием с выводом значения
     */
    public static  String decorator(int a){
        /**
         *Метод для диколирования с преамбулой которая выводит число а
         */
        return String.format("Here is your : %d", a);
    }
}
