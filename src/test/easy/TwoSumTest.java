package easy;

import algo.easy.TwoSum;
import org.junit.jupiter.api.Test;

import java.util.PriorityQueue;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {

    static TwoSum algoObj;

    @Test
    public void test1() {
        algoObj = new TwoSum();
        assertArrayEquals(new int[]{0,1},algoObj.twoSum(new int[]{2,7,11,15},9));
    }

    @Test
    public void test2() {
        algoObj = new TwoSum();
        assertArrayEquals(new int[]{1,2},algoObj.twoSum(new int[]{3,2,4},6));
    }

    @Test
    public void test3() {
        algoObj = new TwoSum();
        assertArrayEquals(new int[]{0,1},algoObj.twoSum(new int[]{3,3},6));
    }
}
