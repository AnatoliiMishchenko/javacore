package org.example;

public class Boss extends Work {

    public Boss(String firstName, String name, String nameTwo, String workName, String phoneNumber, int money, int age) {
        super(firstName, name, nameTwo, workName, phoneNumber, money, age);
    }

    public static void moneyWorks(Work[] works, int salary) {
        for (int i = 0; i < works.length; i++) {
            if (works[i] instanceof Boss) {}
            else {
                works[i].setMoney(works[i].getMoney() + salary);
            }
        }
    }
}
