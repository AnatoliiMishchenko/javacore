package org.example;

/**
 * Урок 3. Классы и объекты
 * Опишите класс руководителя, наследник от сотрудника.
 * Перенесите статический метод повышения зарплаты (сделать статическим) в класс руководителя,
 * модифицируйте метод таким образом, чтобы он мог поднять заработную плату всем, кроме руководителей.
 * В основной программе создайте руководителя и поместите его в общий массив сотрудников.
 * Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась.
 * 2.(*) Сделать компараторы для Сотрудников на основе ЗП и Возраста
 */
public class Main {
    public static void main(String[] args) {
        Work workOne = new Work("tom5", "tom4", "ren2", "work", "+79137548431", 4500, 35);
        Work workTwo = new Work("tom4", "tom3", "ren3", "work", "+79137548431", 2500, 25);
        Work workFree = new Work("tom3", "tom2", "ren2", "work", "+79137548431", 3500, 30);
        Work workFour = new Work("tom2", "tom1", "ren4", "work", "+79137548431", 4300, 20);
        Boss boss = new Boss("tom1", "tom", "ren3", "boss", "+79137548431", 43000, 20);

        Work[] works = {workOne, workTwo, workFree, workFour,boss};

        Boss.moneyWorks(works, 5000);

        for (Work t:works
             ) {

            System.out.println(t.toString());
        }






    }


}