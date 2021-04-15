package ro.fasttrackit.curs10.collections;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private final List<String> fruits = new ArrayList<>();

    public boolean find(String fruit) {
        for (String myFruit : fruits) {
            if (fruit.equals(myFruit)) {
                return true;
            }
        }
        return false;
    }
}
