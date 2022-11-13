package Lambda_3B_Functional_Interfases;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class UserTest {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(User.builder().firstName("Bob").lastname("Fox").age(30).build());
        users.add(User.builder().firstName("Alex").lastname("Bond").age(25).build());
        users.add(User.builder().firstName("Kelly").lastname("Ellins").age(25).build());

        printName(users, predicate -> true);  //if user's last name start from "E", print the object

    }

    private static void printName(List<User> users, Predicate<User> userPredicate) {

        for (User eachUser : users) {
            if (userPredicate.test(eachUser));
            System.out.println(eachUser);
        }
    }
}
