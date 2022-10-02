import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.List;

@RunWith(JUnit4.class)
public class MatrixTraversalTest {

    @Test
    public void testHappyCase() {
        int array[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        List<Integer> expected = Arrays.asList(1,2,3,4, 8,12,16, 15,14,13, 9,5, 6,7, 11,10);
        MatrixTraversal matrixTraversal = new MatrixTraversal();
        List<Integer> result  = matrixTraversal.spiralOrder(array);
        Assert.assertEquals(result,expected);
    }

    @Test
    public void testEmptyArrayCase() {
        int array[][] = {};
        List<Integer> expected = Arrays.asList();
        MatrixTraversal matrixTraversal = new MatrixTraversal();
        List<Integer> result  = matrixTraversal.spiralOrder(array);
        Assert.assertEquals(result,expected);
    }
}