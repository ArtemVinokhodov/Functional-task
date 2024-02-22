package entity;

public class User {
    private final String name;
    private final String phoneNumber;


    public User(String name, String quantity) {
        this.name = name;
        this.phoneNumber = quantity;
    }

    @Override
    public String toString() {
        return "User{" +
                " name='" + name + '\'' +
                ", has phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
