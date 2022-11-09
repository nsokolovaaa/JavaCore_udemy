package Collection;

import Collections.CustomLinkList;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        List<Integer> link = new LinkedList<>();
        Set<Integer> hashSet = new HashSet<>();
        SortedSet<Integer> treeS = new TreeSet<>();
        int[] mass = new int[]{5, 80, 7, 6, 565};
        fillCollection(array, mass);
        fillCollection(link, mass);
        fillCollection(hashSet, mass);
        fillCollection(treeS, mass);
        System.out.println("\n ArrayList: ");
        printCollection(array);
        System.out.println("\n LinkedList: ");
        printCollection(link);
        System.out.println("\n HashSet: ");
        printCollection(hashSet);
        System.out.println("\n TreeSet: ");
        printCollection(treeS);


    }

    private static void printCollection(Collection<Integer> collection) {
        for (Integer print : collection) {
            System.out.print(print + ", ");
        }

    }

    private static void fillCollection(Collection<Integer> collection, int[] args) {
        for (int element : args) {
            collection.add(element);

        }

    }


}



