package com.blackboardtuitions.searching;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class BinarySearchTest {
    private int[] data;

    @Before
    public void initialize(){
        data = new int[]{1,4,7,10,50,55,55,78, 100};
    }

    @Test
    public void checkBinarySearchRecursive(){
        Assert.assertEquals("existing value check", Arrays.binarySearch(data, 10), BinarySearch.binarySearchRecursion(data, 10));
        Assert.assertEquals("left boundary existing value check", Arrays.binarySearch(data, 1), BinarySearch.binarySearchRecursion(data, 1));
        Assert.assertEquals("right boundary existing value check", Arrays.binarySearch(data, 100), BinarySearch.binarySearchRecursion(data, 100));
        Assert.assertEquals("non-existing val check", -1 , BinarySearch.binarySearchRecursion(data, 200));

        data = new int[]{1,4,7,20,20,20,20, 35,50,50,100,100,200,200,200};
        int idx = BinarySearch.binarySearchRecursion(data, 20);
        Assert.assertTrue((idx == 3) || (idx==4) || (idx==5) || (idx==6));
    }

    @Test
    public void checkBinarySearchIterative(){
        Assert.assertEquals("existing value check", Arrays.binarySearch(data, 10), BinarySearch.binarySearchIterative(data, 10));
        Assert.assertEquals("left boundary existing value check", Arrays.binarySearch(data, 1), BinarySearch.binarySearchIterative(data, 1));
        Assert.assertEquals("right boundary existing value check", Arrays.binarySearch(data, 100), BinarySearch.binarySearchIterative(data, 100));
        Assert.assertEquals("non-existing val check", -1 , BinarySearch.binarySearchIterative(data, 200));

        data = new int[]{1,4,7,20,20,20,20, 35,50,50,100,100,200,200,200};
        int idx = BinarySearch.binarySearchIterative(data, 20);
        Assert.assertTrue((idx == 3) || (idx==4) || (idx==5) || (idx==6));
    }

}