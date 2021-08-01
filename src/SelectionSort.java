public class SelectionSort {
    /**
     * This method sorts an unsorted array of integers using the selection sort algorithm.
     * In essence, find the largest integer in the array, swap it with the last element in the array,
     * and repeat taking into account the length of the array - 1 each iteration.
     *
     * @param  listToSort  The unsorted list of integers to sort
     * @return n/a - to add soon
     */
    public int[] sort(int[] listToSort){
        int last = listToSort.length-1;

        int maxPos, temp;

        while (last >= 0){
            maxPos = findMax(listToSort, last);
            temp = listToSort[maxPos];

            listToSort[maxPos] = listToSort[last];
            listToSort[last] = temp;
            last--;
        }
        return listToSort;
    }

    public int findMax(int[] listToSort, int last){
        int maxIndex = 0;
        int maxValue = 0;

        for (int i=0; i <= last; i++){
            if (listToSort[i] > maxValue){
                maxValue = listToSort[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
