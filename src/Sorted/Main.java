package Sorted;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        list.add("DDD");
        System.out.println("*************************");
        int[] arg = new int[]{2,5,10,25,10,58};
        bubbleSort(arg);
        for (int element : arg) {
            System.out.println(element);
        }

    }

    private static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = tmp;

                }

            }
        }
    }

    private static int linearSearcher(List<String> list, String arg) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(arg)) {
                return i;
            }
        }
        return -1;
    }
}