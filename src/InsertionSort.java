public class InsertionSort {
    /**
     * This method sorts an unsorted array of integers using the insertion sort algorithm.
     *
     * @param  listToSort  The unsorted list of integers to sort
     * @return n/a - to add soon
     */
    public void sort(int[] listToSort){
        int pos = listToSort.length - 1;
        while (pos > 0){
            int indexNew = pos -1;
            int valueNew = listToSort[indexNew];
            while ((indexNew < listToSort.length-1) && (valueNew > listToSort[indexNew+1])){
                listToSort[indexNew] = listToSort[indexNew+1];
                indexNew++;
            }
            listToSort[indexNew] = valueNew;
            pos--;
        }
    }
}
