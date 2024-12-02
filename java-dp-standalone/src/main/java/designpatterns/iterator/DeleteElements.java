package designpatterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DeleteElements {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("John Doe", "Jack Doe", "Jane Doe"));

//        for (String name : names) {
//            System.out.println(name);
//            if (name.startsWith("John")) {
//                names.remove(name);
//            }
//        }

        Iterator<String> iterator = names.iterator(); // ? factory method
        System.out.println(iterator.getClass().getName());
        while (iterator.hasNext()) {
            var name = iterator.next();
            if (name.startsWith("John")) {
                iterator.remove();
            }
        }

//        names.removeIf(name -> name.startsWith("John"));

//        List<String> namesToRemove = new ArrayList<>();
//        for (String name : names) {
//            if (name.startsWith("John")) {
//                namesToRemove.add(name);
//            }
//        }
//        names.removeAll(namesToRemove);

        names.getFirst();
        // names.get(0)
        names.getLast();
    }
}
