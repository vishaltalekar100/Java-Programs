package basics.miscellaneous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToArrayList {

    public static void main(String[] args) {
        // Normal array - 1
        String[] array = {"A", "B", "C"};
        // Convert array to ArrayList
        List<String> arrayList = new ArrayList<>(Arrays.asList(array));
        // Print the ArrayList
        System.out.println(arrayList);

        // Normal array - 2
        Integer[] array1 = {1, 2, 3, 4, 5};
        // Convert array to ArrayList
        List<Integer> arrayList1 = new ArrayList<>();
        Collections.addAll(arrayList1, array1);
        // Print the ArrayList
        System.out.println(arrayList1);

        // Normal array - 3
        Double[] array2 = {1.1, 2.2, 3.3};
        // Convert array to ArrayList
        List<Double> arrayList2 = new ArrayList<>();
        for (Double num : array2) {
            arrayList2.add(num);
        }
        // Print the ArrayList
        System.out.println(arrayList2);
    }
}
