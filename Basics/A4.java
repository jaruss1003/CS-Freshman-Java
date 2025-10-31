class A4 {
    public static void main (String []args) {
        int b[][], c[][], a[][] = {
            {0, 1},
            {2, 3}
        };
        
        if (a.length == 0 && b.length == 0) {
        } else {
            boolean different = false;

            if (a.length != b.length || a[0].length != b[0].length) {
            } else {
                c = new int[a.length][a[0].length];
                for (int row = 0; row < a.length && !different; row++) {
                    for (int col = 0; col < a[0].length && !different; col++) {
                        c[row][col] = Math.max(a[row][col], b[row][col]);
                    }
                }
            }
        }
        
        // TODO: Print difference
    }
}
