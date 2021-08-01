public class BubbleSort {
    /**
     * This method sorts an unsorted array of integers using the bubble sort algorithm.
     *
     * @param  listToSort  The unsorted list of integers to sort
     * @return n/a - to add soon
     */
    public int[] sort(int[] listToSort){
        for (int i=0; i<listToSort.length-1; i++){
            for (int j=0; j< listToSort.length - i - 1; j++){
                if (listToSort[j] > listToSort[j+1]){
                    int temp = listToSort[j];
                    listToSort[j] = listToSort[j+1];
                    listToSort[j+1] = temp;
                }
            }
        }
        return listToSort;
    }
}
