public class SortingChecking {

    private static boolean isArraySortedAscending(int[] numbersArray) {
        for (int i = 1; i < numbersArray.length; i++) {
            if (numbersArray[i - 1] > numbersArray[i]) {
                return false;
            }
        }

        return true;
    }

    private static boolean isArraySortedDescending(int[] numbersArray) {
        for (int i = 1; i < numbersArray.length; i++) {
            if (numbersArray[i - 1] < numbersArray[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] ascendingArray = {3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
        int[] descendingArray = {17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3};

        System.out.println("The array is sorted in ascending order: " + isArraySortedAscending(ascendingArray));
        System.out.println("The array is sorted in descending order: " + isArraySortedDescending(descendingArray));
    }
}
