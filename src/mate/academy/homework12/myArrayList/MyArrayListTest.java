package mate.academy.homework12.myArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyArrayListTest {
    MyArrayList<String> expectedTestList = new MyArrayList<>();
    MyArrayList<String> actualTestList = new MyArrayList<>();

    @Before
    public void addValueToExpectedTestList() {
        expectedTestList.add("Illia");
        expectedTestList.add("Maria");
    }

    @Test
    public void size() {
        if (expectedTestList.size() > expectedTestList.size()) {
            throw new IndexOutOfBoundsException();
        } else {
            Assert.assertEquals(2, expectedTestList.size());
        }
    }

    @Test
    public void isEmpty() {
        Assert.assertFalse(expectedTestList.isEmpty());
    }

    @Test
    public void add() {
        actualTestList.add("Dynamo");
        Assert.assertFalse(actualTestList.isEmpty());
    }

    @Test
    public void clear() {
        expectedTestList.clear();
        actualTestList.clear();
        for (int i = 0; i < expectedTestList.size(); i++) {
            Assert.assertEquals(expectedTestList.get(i), actualTestList.get(i));
        }
    }

    @Test
    public void get() {
       Assert.assertEquals("Illia", expectedTestList.get(0));
    }

    @Test
    public void remove() {
        actualTestList = new MyArrayList<>();
        actualTestList.add("Dynamo");
        actualTestList.add("Manchester");
        actualTestList.remove(1);
        Assert.assertEquals(1, actualTestList.size());
    }
}