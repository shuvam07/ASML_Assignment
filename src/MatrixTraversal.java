import java.util.ArrayList;
import java.util.List;

public class MatrixTraversal {

    public static List<Integer> spiralOrder(int array[][]) {
        List<Integer> result = new ArrayList<>();
        int row = array.length;
        if(row == 0)
            return result;
        int col = array[0].length;
        int total = row * col, i;

        int startRow = 0;
        int endRow = row - 1;
        int startCol = 0;
        int endCol = col - 1;


        while (total > 0) {
            for (i = startCol; i <= endCol && total > 0; i++) {
                result.add(array[startRow][i]);
                total--;
            }
            startRow++;

            for (i = startRow; i <= endRow && total > 0; i++) {
                result.add(array[i][endCol]);
                total--;
            }
            endCol--;

            for (i = endCol; i >= startCol && total > 0; i--) {
                result.add(array[endRow][i]);
                total--;
            }
            endRow--;

            for (i = endRow; i >= startRow && total > 0; i--) {
                result.add(array[i][startCol]);
                total--;
            }
            startCol++;

        }
        return result;
    }

}
