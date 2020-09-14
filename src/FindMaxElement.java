public class FindMaxElement {
    public static void main(String[] args) {
        int[][] array = {
                {5, 1, 7},
                {2, 4, 6},
                {20, 15},
        };
        int max = array[0][1];
        System.out.println("Default Max is: " + max);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    System.out.println("Max = " + max);
                    System.out.println("Position = " + " Row: " + i + ", Column: " + j);
                }
            }
        }
    }
}
