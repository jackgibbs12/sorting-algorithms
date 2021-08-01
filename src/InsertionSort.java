public class InsertionSort {
    /**
     * This method sorts an unsorted array of integers using the insertion sort algorithm.
     * In essence, starting with the second element in the array, check whether it is smaller than
     * the element to the left, if so, continue moving it left while it is smaller than the element
     * on the left.
     *
     * @param  listToSort  The unsorted list of integers to sort
     * @return n/a - to add soon
     */
    public void sort(int[] listToSort){

        int element, position;
        for (int i = 1; i < listToSort.length; i++){
            element = listToSort[i];
            position = i - 1;
            while ((position >= 0) && (element < listToSort[position])){
                listToSort[position + 1] = listToSort[position];
                position--;
            }
            listToSort[position + 1] = element;
        }
    }
}
