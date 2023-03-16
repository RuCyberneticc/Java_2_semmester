import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6}};

        int rows = arr.length;
        int columns = arr[0].length;
        int[][] transposedArr = new int[columns][rows];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                transposedArr[j][i] = arr[i][j];
            }
        }

        System.out.println(Arrays.deepToString(transposedArr));
    }
}
