/**************************************************************************
 * @By: Jacob Russ
 * @Lab: 26
 * @CSE 1001 Fund Software, Fall 2024
 * @Date: December 2, 2024
 * @Description: This program animates the Insert Sort algorithm using ArrayAnime.
 **************************************************************************/

import java.awt.Color;

class InsertSortAnime {

    static void insertSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;

            // Move elements of a[0..i-1] that are greater than key to one position ahead
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                ArrayAnime.draw(a, key, j, j + 1, StdDraw.RED, StdDraw.BLUE, StdDraw.GREEN);
                StdDraw.pause(2000); // Pause for animation
                j = j - 1;
            }
            a[j + 1] = key;
            ArrayAnime.draw(a, -1, j + 1, -1, StdDraw.BLACK, StdDraw.BLACK, StdDraw.BLACK);
            StdDraw.pause(2000); // Pause for animation
        }
    }

    public static void main(String[] args) {
        // Initialize drawing canvas and font
        ArrayAnime.initCanvas(30);

        int a[] = {50, 40, 30, 20, 10}; // Array to sort

        insertSort(a);

        // Show final result
        ArrayAnime.draw(a, -1, a.length, -1, StdDraw.BLACK, StdDraw.BLACK, StdDraw.BLACK);
    }
}
