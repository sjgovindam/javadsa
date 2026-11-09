
//Three pointer approach
package week2_collections.Day2;

import java.util.*;

public class CommonElementsInThreeArrays {

    public List<Integer> commonElements(int[] arr1, int[] arr2, int[] arr3) {

        List<Integer> result = new ArrayList<>();

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length &&
               j < arr2.length &&
               k < arr3.length) {

            // All three elements are equal
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {

                // Avoid duplicates
                if (result.isEmpty() ||
                    result.get(result.size() - 1) != arr1[i]) {

                    result.add(arr1[i]);
                }

                i++;
                j++;
                k++;
            }

            // Move pointer of the smallest element
            else if (arr1[i] < arr2[j]) {
                i++;
            }
            else if (arr2[j] < arr3[k]) {
                j++;
            }
            else {
                k++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        CommonElementsInThreeArrays solution =
            new CommonElementsInThreeArrays();

        int[] arr1 = {1, 5, 10, 20, 40, 80};
        int[] arr2 = {6, 7, 20, 80, 100};
        int[] arr3 = {3, 4, 15, 20, 30, 70, 80, 120};

        List<Integer> result =
            solution.commonElements(arr1, arr2, arr3);

        System.out.println(result);
    }
}
