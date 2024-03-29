package problem8;

import java.time.LocalDate;
import java.util.Arrays;

public class DuoTest {
    public static void main(String[] args) {
        LocalDate[] birthdays =
                {
                        LocalDate.of(2022, 12, 9),
                        LocalDate.of(1815, 12, 10),
                        LocalDate.of(1652, 12, 6),
                        LocalDate.of(1999, 6, 28),
                };
        // Uncomment below to test your solution.

        Duo<LocalDate> mm = minmax(birthdays);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());

        String[] strs = {"Josh", "Mike", "James"};
        Duo<String> mm2 = minmax(strs);
        System.out.println("min = " + mm2.getFirst());
        System.out.println("max = " + mm2.getSecond());


    }

    /**
     * Define a method called minmax() to get the minimum and maximum of an array of elements.
     * Input: arr - an array of elements
     * Return: a Duo object with the min and max value, or null if arr is null or empty
     */
    public static <E> Duo minmax(E [] arr){
        if(arr == null){
            return null;
        }
        Arrays.sort(arr);
        E first = arr[0];
        E second = arr[arr.length-1];

        Duo retAns = new Duo(first, second);
        return retAns;

    }

    /**
     * Define a method called findMiddle() to gets element stored at the middle of the array.
     * Input: an array of elements, e.g., an array of integers, an array of strings
     * Return: element at the middle
     */
    public static <E> Duo findMiddle(E [] arr){
        if(arr == null){
            return null;
        }
        //get element in middle of array
        E midEle = arr[arr.length/2];
        Duo ans = new Duo();

        ans.setFirst(midEle);
        return ans;
    }

}
