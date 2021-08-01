public class Sorter {
    public static void main(String[] args){
        BubbleSort bubbleSort = new BubbleSort();
        InsertionSort insertionSort = new InsertionSort();
        SelectionSort selectionSort = new SelectionSort();
        int[] listToSort = {3,7,5,4,2,56,32,12};
        int[] sortedList = insertionSort.sort(listToSort);

    }
}
