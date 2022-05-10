
import org.testng.Assert;
import org.testng.annotations.Test;

public class SortArrayTest {


    @Test
    public void testSortArray() {

        int[] array = {4, -3, 7, -12, 5, -2, 9, 4, 12};
        int[] expectedResult = {-12, -3, -2, 4, 4, 5, 7, 9, 12};
       // int[] actualResult = SortArray.sortArray(array);
       // Assert.assertEquals(actualResult,expectedResult);

    }

    @Test
    public void testSortArray1() {

        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int[] expectedResult = {2, 3, 4, 4, 5, 7, 9, 12, 12};

        SortArray sortArray = new SortArray();
        int[] actualResult = sortArray.sortArray(array);
        Assert.assertEquals(actualResult, expectedResult);
    }


}
