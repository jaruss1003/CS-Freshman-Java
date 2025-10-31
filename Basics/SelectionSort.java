class SelectionSort {
    static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%3d ", a[i]);
        }
        System.out.println();
    }

    public static void selectionSort(int[] a) {
        int minPos, temp;
        for (int i = 0; i <= a.length - 2; i++) {
            minPos = i;
            for (int j = i + 1; j <= a.length - 1; j++) {
                if (a[j] < a[minPos]) {
                    minPos = j;
                }
            }
            temp = a[i];
            a[i] = a[minPos];
            a[minPos] = temp;
            printArray(a);
        }
    }

    public static void main(String[] args) {
        int[] array = {50, 40, 30, 20, 10};
        printArray(array);
        selectionSort(array);
        printArray(array);
    }
}
