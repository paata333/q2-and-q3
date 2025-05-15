package oop.q2;

import java.util.*;

/**
 * ListComparer - A class that processes two lists and identifies repeated elements.
 *
 * This class processes a list of integers (list1) and a list of strings (list2).
 * For each element in list2, it checks if it has appeared before.
 * If an element appears more than once in list2 (regardless of position),
 * all its occurrences are added to the result list.
 *
 * @author Paata Shvelidze
 * @version 1.0
 * @since 2025-05-15
 */
public class ListComparer {

    /**
     * Processes two lists to create a result list containing elements that appear multiple times in list2.
     * First identifies which strings occur more than once, then collects all occurrences of those strings.
     *
     * @param list1 a list of integers (used for context in this assignment)
     * @param list2 a list of strings that will be checked for repetitions
     * @return a list of strings containing elements that appear multiple times in list2
     */
    public static List<String> processLists(List<Integer> list1, List<String> list2) {
        // First, identify which elements appear more than once
        Map<String, Integer> frequency = new HashMap<>();
        for (String s : list2) {
            frequency.put(s, frequency.getOrDefault(s, 0) + 1);
        }

        // Create a set of strings that appear more than once
        Set<String> repeatedStrings = new HashSet<>();
        for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() > 1) {
                repeatedStrings.add(entry.getKey());
            }
        }

        // Collect all occurrences of repeated strings
        List<String> result = new ArrayList<>();
        for (String s : list2) {
            if (repeatedStrings.contains(s)) {
                result.add(s);
            }
        }

        return result;
    }

    /**
     * Main method to demonstrate the list comparison functionality.
     * Creates list1 and list2 with predefined values and processes them.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        // Creating list1 and list2 with predefined values as shown in the problem
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);

        List<String> list2 = Arrays.asList(
                "apple", "banana", "cherry", "date", "fig", "grape",
                "apple", "banana", "cherry", "date", "fig", "grape",
                "kiwi", "lemon", "mango", "nectarine", "orange"
        );

        List<String> resultList = processLists(list1, list2);

        System.out.println("Result list: " + resultList);
    }
}