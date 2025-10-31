class SelSortRec {
    public static void main(String[] args) {
        int a[] = {50, 40, 30, 10};
        selectionSort(a, 0); // Call recursive selection sort
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " "); // Print sorted array
        }
    }

    // Find the position of the minimum value in the array starting from 'first'
    static int findMinPos(int[] a, int first) {
        int minPos = first;
        for (int j = first + 1; j < a.length; j++) { // Removed the semicolon after 'for'
            if (a[j] < a[minPos]) {
                minPos = j;
            }
        }
        return minPos;
    }

    // Swap two elements in the array
    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // Recursive selection sort
    static void selectionSort(int[] a, int first) {
        if (first == a.length - 1) return; // Base case: array is fully sorted
        int minPos = findMinPos(a, first); // Find the minimum position
        swap(a, first, minPos); // Swap the current element with the smallest
        selectionSort(a, first + 1); // Recur for the rest of the array
    }
}
