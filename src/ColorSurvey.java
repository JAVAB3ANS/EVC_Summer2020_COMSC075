/* Working with ragged 2-d arrays
* Jason Vu - 7/2/2020
* Given an array of color choices, each person could choose the pair 
* of colors from a list of five that were their favorites. Returns 
* how many people completed the survey.
*/package src;

public class ColorSurvey {
    public static void main(String[] args) {
        int[][] choices = {
            {9},
            {7, 5},
            {4, 6, 1},
            {3, 1, 2, 8}
        };

        //Scanner input = new Scanner(System.in);

        int totalPeopleSurveyed = 0;

        for (int row = 0; row < choices.length; row++) {
            int nColumns = choices[row].length;
            System.out.printf("Row %d has %d columns(s).\n", row, nColumns);
            for (int col = 0; col < nColumns; col++) {
                totalPeopleSurveyed += choices[row][col];
            }
        }

        System.out.printf("Total number of people surveyed: %d\n", totalPeopleSurveyed);

        //input.close();
    }
}