import java.util.*;
import java.util.stream.*;

public class Aug8StreamAndCollections {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(0);
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);

        System.out.println(l1);

        // Map: Adds 10 to each element and collects to a new list.
        List<Integer> l2 = l1.stream().map(i -> i + 10).collect(Collectors.toList());
        System.out.println(l2);

        // Filter & Count: Counts the number of even elements.
        long count = l1.stream().filter(i -> i % 2 == 0).count();
        System.out.println(count);

        // Filter & Collect: Filters for even numbers and collects them.
        List<Integer> l3 = l1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(l3);

        // Sort: Sorts the elements using a custom comparator.
        Comparator<Integer> comp = (i1, i2) -> i1.compareTo(i2);
        List<Integer> l4 = l1.stream().sorted(comp).collect(Collectors.toList());
        System.out.println(l4);

        // Min & Max: Finds the minimum and maximum elements in the stream.
        Integer min = l1.stream().min(comp).get();
        Integer max = l1.stream().max(comp).get();
        System.out.println(min); // Added this print statement to show the min value.
        System.out.println(max);

        // ForEach: Prints each element of the filtered list.
        l3.stream().forEach(System.out::println);
    }
}