package entity;

import java.util.ArrayList;

public class DataProvider {
    public ArrayList<User> getDate() {
        ArrayList<User> list = new ArrayList<>();
        list.add(new User("BananaName", "123"));
        list.add(new User("TomatoName", "1420"));
        list.add(new User("Jek", "7130"));
        return list;
    }
}
