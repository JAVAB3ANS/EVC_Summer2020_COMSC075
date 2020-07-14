package src;

public class ReturnNames {
    public static int[] mergeArray(int[] list1, int[] list2) {
        int[] mergedResult = {0};
        return mergedResult;
    }

    public static double geometricMean(double val1, double val2) {
        double result = Math.sqrt(val1 * val2);
        return result;
    }

    public static void main(String[] args) {
        int[] data1 = {1, 7, 12};
        int[] data2 = {9, 16, 18, 22};
        int[] result = mergeArray(data1, data2);

        double firstNumber = 37.2;
        double secondNumber = 47.9;
        double weirdResult = geometricMean(firstNumber, secondNumber);

        System.out.println("Geometric mean of two values is: " + weirdResult);
        System.out.println("Result of merged list: " + result);
    }
}