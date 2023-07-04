package org.example;

import java.lang.invoke.WrongMethodTypeException;

/**
 * Урок 4. Обработка исключений
 * реализовать логику приложения Магазин из описания к уроку.
 *
 * Добавить перечисление с гендерами. В класс покупателя добавить свойство «пол» со значением созданного перечисления.
 * Добавить геттеры, сеттеры.
 * <p>
 * Добавить в приложение Магазин учет цены товара - в Заказ добавить поле стоимость.
 * Добавить перечисление с размерами скидок - 0, 5, 10, 15, 20%.
 * Написать метод, при вызове которого на переданный тип товара незначается
 * рандомная скидка из перечисления (меняем значение поля price)
 * <p>
 * ** Товарам добавить категорию. Задать категории Стандарт и Премиум.
 * Если на товар категории Премиум назначилась скидка более 15%, выбросить исключение TooMuchSaleException(msg),
 * сообщение с ошибкой вывести в консоль,
 * цену товара не менять.
 */
public class Main {
    private String password;
    private String login;
    private String configPassword;

    public static void main(String[] args) {
        try {
            paswordFilter("ddsfssadffsda", "dadadf", "dada");
        } catch (WrondPasswordException e) {
            System.out.println(e.getMessage());
        }  catch (WrongLoginException e) {
            System.out.println(e.getMessage());
        }
    }
    public static boolean paswordFilter(String login, String password, String configPassword) throws WrongLoginException,
            WrondPasswordException {
        if (login.length() > 20) {
            throw new WrongLoginException("login Lenght is more then 20 symbols, false");
        }
        if (password.length() > 20) {
            throw new WrondPasswordException("Password lenght is more then 20 symbols");
        }
        if (password.length() != configPassword.length() || !password.equals(configPassword)) {

            throw new WrondPasswordException("Password and configpassword not equal");
        }
        return true;
    }
}
