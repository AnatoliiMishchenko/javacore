package Shop;

public class Custemer {
    private String firstName;
    private String name;
    private int age;
    private String phone;


    Sex sex;



    public Custemer(String firstName, String name, int age, String phone, Sex sex) {
        this.firstName = firstName;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.sex= sex;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Object getSex(Sex sex) {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }


}
