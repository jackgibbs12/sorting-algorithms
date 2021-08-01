# sorting-algorithms
## Bubble Sort
Bubble sort compares consecutive pairs of elements sequentially in an array
and switches them if the latter is smaller than the former. Bubble sort is 
stable and has an average and worst time complexity of O(n^2), and best case O(n).

    BubbleSort bubbleSort = new BubbleSort();
    int[] listToSort = {3,7,5,4,2,56,32,12};
    int[] sortedList = bubblesort.sort(listToSort);

## Insertion Sort
Insertion sort splits the array into a sorted and unsorted section. Values
from the unsorted section of the array are checked sequentially and placed
at the correct index in the sorted section. It is stable and has time complexity 
O(n^2) in the worst case.

    InsertionSort insertionSort = new InsertionSort();
    int[] listToSort = {3,7,5,4,2,56,32,12};
    int[] sortedList = insertionSort.sort(listToSort);

## Selection Sort
Insertion sort works by ordering an array of elements by finding the maximum,
and putting it in the correct place in the list. Find the maximum, swap it
with the end of the list, and reduce the size of the list by 1 since the last
element is the largest and does not need to be moved again. Selection sort
is not stable and has time complexity O(n^2).

    SelectionSort selectionSort = new SelectionSort();
    int[] listToSort = {3,7,5,4,2,56,32,12};
    int[] sortedList = selectionSort.sort(listToSort);

