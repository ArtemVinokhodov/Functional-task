package model;

import entity.User;

import java.util.ArrayList;
import java.util.function.Consumer;

public class DataProcessingModel {
    public void processingData(ArrayList<User> list, Consumer<User> consumer) {
        for (User user : list) {
            consumer.accept(user);
        }
    }
}
