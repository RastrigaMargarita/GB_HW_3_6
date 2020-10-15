import org.junit.*;

public class TestOfArrayHandler {
    private static ArrayHandler arrayHandler;

    @BeforeClass
    public static void createArrayHandler(){
        arrayHandler = new ArrayHandler();
    }

    @Test
    public void testRestOfCheckedNum1(){
        Assert.assertArrayEquals(new int[]{1,7},arrayHandler.RestOfCheckedNum(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}));
    }
    @Test(expected = RuntimeException.class)
    public void testRestOfCheckedNum2(){
        Assert.assertArrayEquals(new int[]{},arrayHandler.RestOfCheckedNum(new int[]{1, 2,3,5}));
    }
    @Test
    public void testRestOfCheckedNum3(){
        Assert.assertArrayEquals(new int[]{},arrayHandler.RestOfCheckedNum(new int[]{4, 4}));
    }

    @Test(expected = RuntimeException.class)
    public void testRestOfCheckedNum4(){
        Assert.assertArrayEquals(new int[]{},arrayHandler.RestOfCheckedNum(new int[]{}));
    }

    @Test
    public void ContainedIfCheckedNum1(){
        Assert.assertTrue(arrayHandler.ContainedIfCheckedNum(new int[]{1, 1, 1, 4, 4, 1, 4, 4}));
    }
    @Test
    public void ContainedIfCheckedNum2(){
        Assert.assertFalse(arrayHandler.ContainedIfCheckedNum(new int[]{1, 1, 1, 1, 1, 1}));
    }
    @Test
    public void ContainedIfCheckedNum3(){
        Assert.assertFalse(arrayHandler.ContainedIfCheckedNum(new int[]{4,4, 4, 4}));
    }
    @Test
    public void ContainedIfCheckedNum4(){
        Assert.assertFalse(arrayHandler.ContainedIfCheckedNum(new int[]{1, 1, 3, 4, 4, 1, 4, 4}));
    }

}
