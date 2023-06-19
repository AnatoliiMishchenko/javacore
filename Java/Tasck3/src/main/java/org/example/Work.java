package org.example;

public class Work {

    private String firstName;
    private String name;
    private String nameTwo;
    private String workName;
    private String phoneNumber;
    private int money;
    private int age;


    public Work(String firstName, String name, String nameTwo, String workName, String phoneNumber, int money, int age) {
        this.firstName = firstName;
        this.name = name;
        this.nameTwo = nameTwo;
        this.workName = workName;
        this.phoneNumber = phoneNumber;
        this.money = money;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameTwo() {
        return nameTwo;
    }

    public void setNameTwo(String nameTwo) {
        this.nameTwo = nameTwo;
    }

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("firstName = %s   name = %s   nameTwo = %s  workname = %s  phoneNumber = %s  money = %d   age = %d", firstName, name, nameTwo,
                workName, phoneNumber, money, age);
    }


}

