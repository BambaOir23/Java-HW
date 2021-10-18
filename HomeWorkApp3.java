import java.util.Arrays;

public class HomeWorkApp3 {
    public static void main(String[] args) {

        System.out.println("Задача #1");
        int[] array = {1, 0, 1, 1, 1, 0, 1, 0, 0, 1};
        System.out.println(Arrays.toString(array));
        changeZeroesAndOnes(array);
        System.out.println(Arrays.toString(array));

        System.out.println("Задача #2");
        int[] secondArray = new int[100];
        System.out.println(Arrays.toString(secondArray));
        fillArrayWithSequence(secondArray);
        System.out.println(Arrays.toString(secondArray));

        System.out.println("Задача #3");
        int[] thirdArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(thirdArray));
        doubleNumbersLessThanSixIn(thirdArray);
        System.out.println(Arrays.toString(thirdArray));

        System.out.println("Задача #4");
        int[][] square = new int[10][10];
        System.out.println("With zeroes");
        printSquare(square);
        fillDiagonalsWithOnes(square);
        System.out.println("With ones.");
        printSquare(square);

        System.out.println("Задача #5");
        int initialValue = 10;
        int size = 5;
        int[] fourthArray = getNewArrayWith(initialValue, size);
        System.out.println(Arrays.toString(fourthArray));

    }

    private static int[] getNewArrayWith(int initialValue, int size) {
        int[] result = new int[size];
        for (int i = 0; i < result.length; i++) {
            result[i] = initialValue;
        }
        return result;
    }

    private static void printSquare(int[][] square) {
        for (int i = 0; i < square.length; i++) {
            System.out.println(Arrays.toString(square[i]));
        }
    }

    private static void fillDiagonalsWithOnes(int[][] square) {
        for (int n = 0; n < square.length; n++) {
            square[n][n] = 1;
            square[n][square[n].length - 1 - n] = 1;
        }
    }

    private static void doubleNumbersLessThanSixIn(int[] thirdArray) {
        for (int z = 0; z < thirdArray.length; z++) {
            thirdArray[z] = (thirdArray[z] < 6) ? (thirdArray[z] * 2) : thirdArray[z];
        }
    }

    private static void fillArrayWithSequence(int[] secondArray) {
        for (int y = 0; y < secondArray.length; y++) {
            secondArray[y] = (y + 1);
        }
    }

    private static void changeZeroesAndOnes(int[] array) {
        for (int x = 0; x < array.length; x++) {
            array[x] = 1 - array[x];
        }
    }
}
