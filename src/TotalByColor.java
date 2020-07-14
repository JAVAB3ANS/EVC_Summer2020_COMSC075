package src;

public class TotalByColor {
    public static void main(String[] args) {
        String[] colors = {"Red", "Blue", "Yellow", "Tan", "Teal"};

        int[][] choices = {
            {0},
            {9, 0},
            {7, 5, 0},
            {4, 6, 1, 0},
            {3, 1, 2, 8, 0}
        };

        for (int row = 0; row < choices.length; row++) {
            int total = 0;
            int horizontalTotal = 0;
            int verticalTotal = 0;
            System.out.printf("Total for %s: ", colors[row]);

            /* add up all the items in the row */
            for (int column = 0; column < choices[row].length; column++) {
                //total += choices[row][column];
                horizontalTotal += choices[row][column];
            }

            for (int verticalRow = row; verticalRow < choices.length; verticalRow++) {
                verticalTotal += choices[verticalRow][row];
            }

            total = horizontalTotal + verticalTotal;
            System.out.printf("Total for first color choice: %d\n", total);
        }
    }
}