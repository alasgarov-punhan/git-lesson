package az.alasgarov.model;

public class User {
    private String name;
    private String age;
    private String phoneNumber;

    public User() {
    }

    public User(String name, String age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }
}
