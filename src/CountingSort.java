public class CountingSort {
    public int[] sort(int[] listToSort) {

        int lengthOfArray = listToSort.length;
        int[] outputArray = new int[lengthOfArray];
        int[] count = new int[256];

        /* Fill the count array with 0's */
        for (int i = 0; i < 256; i++) {
            count[i] = 0;
        }

        /* Make count[i] contain the number of elements equal to i */
        for (int i = 0; i < lengthOfArray; i++) {
            count[listToSort[i]] += 1;
        }

        /* Change so that count[i] contains the number of elements less than or equal to i */
        for (int i = 1; i < 256; i++) {
            count[i] += count[i - 1];
        }

        /* Create the sorted array */
        for (int i = lengthOfArray - 1; i >= 0; i--) {
            System.out.println(i);
            outputArray[count[listToSort[i]] - 1] = listToSort[i];
            --count[listToSort[i]];
        }

        return outputArray;
    }
}
