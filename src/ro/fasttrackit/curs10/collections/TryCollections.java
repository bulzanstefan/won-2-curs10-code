package ro.fasttrackit.curs10.collections;

import java.util.*;

import static java.util.Comparator.comparingInt;

public class TryCollections {
    public static void main(String[] args) {
        tryCollection();
        tryArrayList();
        tryHashSet();

        operations();

    }

    private static void operations() {

    }

    private static void tryHashSet() {
        System.out.println("----------- SET");
        Set<String> materii = new HashSet<>(List.of("matematica", "info", "romana", "info", "biologie", "filosofie"));

        System.out.println(materii);

        for (String mat : materii) {
            System.out.println(mat);
        }

    }

    private static void tryArrayList() {
        List<Integer> grades = new ArrayList<>(List.of(10, 2, 5, 6, 6, 8, 10));
        //aceeasi functionalitate cu Collection

        System.out.println(grades.get(4));

        grades.add(3, 11);
        System.out.println(grades);

        grades.remove(3);
        System.out.println(grades);

        grades.sort(comparingInt(o -> o));
        System.out.println(grades);

        System.out.println(grades.indexOf(5));
        System.out.println(grades.indexOf(100));

        System.out.println(grades.lastIndexOf(6));

        List<Integer> sublist = grades.subList(3, 4);
        System.out.println(sublist);
    }

    private static void tryCollection() {
        Collection<String> names = new ArrayList<>();
        names.add("Ana");
        names.add("Bogdan");
        names.add("Mihai");

        System.out.println(names);

        names.remove("Ana");
        System.out.println(names);

        System.out.println(names.size());

        System.out.println(names.contains("Bogdan"));
        System.out.println(names.contains("Ana"));

        names.addAll(List.of("Maria", "George", "Dan"));
        System.out.println(names);

        System.out.println(names.isEmpty());
        names.clear();
        System.out.println(names);
        System.out.println(names.isEmpty());

        names.add("Ana");
        System.out.println(names.equals(List.of("Ana")));

        for (String name : names) {
            System.out.println(name);
        }

        names.add("Ioan");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
