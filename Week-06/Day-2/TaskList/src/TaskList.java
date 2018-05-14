
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskList {
        public static void main(String[] args) {
            List<Todo> fleet = new ArrayList<>();

            Todo thing1 = new Todo("Get milk", false);
            fleet.add(thing1);
            Todo thing2 = new Todo("Remove the obstacles", false);
            fleet.add(thing2);
            Todo thing3 = new Todo("Stand up", true);
            fleet.add(thing3);
            Todo thing4 = new Todo("Eat lunch", true);
            fleet.add(thing4);


            Collections.sort(fleet);
            System.out.println(fleet.toString());
        }
    }
