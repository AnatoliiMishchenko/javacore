package Shop;

import java.util.Random;

import static Shop.Sex.MEN;
import static Shop.Sex.WOMEN;


/**
 * Урок 4. Обработка исключений
 * реализовать логику приложения Магазин из описания к уроку.
 * <p>
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

    static Custemer[] custemer = null;
    static Product[] product = null;
    static Oder[] oders = null;

    public static void main(String[] args) throws Exception {
        custemer = new Custemer[]
                {
                        new Custemer("Ivanov", "Ivanov", 33, "+79137548431", WOMEN),
                        new Custemer("Ivanov", "Ivan", 30, "+79137548431", MEN),
                        new Custemer("Ira", "Olya", 31, "+79137547431", WOMEN),
                        new Custemer("Nov", "Tolya", 32, "+79137545431", MEN),
                        new Custemer("Iva", "Dasha", 35, "+79137542431", WOMEN)
                };

        product = new Product[]
                {
                        new Product("it", 58.5),
                        new Product("milk", 58.5),
                        new Product("tea", 78.5),
                        new Product("Coffe", 154.2)
                };

        oders = new Oder[5];

    try {

        oders[0] = makeProduct("+79137548431", "milk", 1);
    } catch (Exception1 | Exception2 e){
        System.out.println(e.getMessage());
    }

    }

    public static Oder makeProduct(String phone, String titrlName, int amount) throws Exception {
        Custemer custemer1 = null;
        Product product1 = null;
        Sale sale = null;
        double prise = 0;

        for (Custemer c : custemer
        ) {
            if (c.getPhone().equals(phone)) {
                custemer1 = c;
            }

        }
        for (Product p : product
        ) {
            if (p.getTitleName().equals(titrlName)) {
                product1 = p;
            }
            if (p.getPrise() > 100) {

                prise = prise * (new Random().nextInt(1,4))*5;
            }
        }
        if(custemer1 == null){
            throw new Exception2("Costomer null");
        }
        if(product1 == null || amount < 1){
            throw new Exception1("Product null");
        }
        return new Oder(custemer1, product1, amount, prise);
    }
}
