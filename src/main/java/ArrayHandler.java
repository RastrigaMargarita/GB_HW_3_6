import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Matcher;

public class ArrayHandler {
    private static int checkedNum = 4;
    private static int checkedNumEx = 1;

    public static void main(String[] args) {
        ArrayHandler arrayHandler = new ArrayHandler();
        System.out.println("/////////Часть массива");
        System.out.println(Arrays.toString(arrayHandler.RestOfCheckedNum(new int[]{1, 4, 5, 4, 8, 9, 6})));
        try {
            System.out.println(Arrays.toString(arrayHandler.RestOfCheckedNum(new int[]{1, 3, 5, 5, 8, 9, 6})));
        } catch (RuntimeException e) {
            System.out.println("Ошибка");
        }
        try {
            System.out.println(Arrays.toString(arrayHandler.RestOfCheckedNum(new int[]{1})));
        } catch (RuntimeException e) {
            System.out.println("Ошибка");
        }
        System.out.println("/////////Содержимое массива");
        System.out.println(arrayHandler.ContainedIfCheckedNum(new int[]{1, 4, 4, 1}));
        System.out.println(arrayHandler.ContainedIfCheckedNum(new int[]{1, 1}));
        System.out.println(arrayHandler.ContainedIfCheckedNum(new int[]{1, 1, 4, 3}));

    }


    public int[] RestOfCheckedNum(int[] ar) throws RuntimeException {
        for (int i = ar.length; i > 0; i--) {
            if (ar[i - 1] == checkedNum) {
                return Arrays.copyOfRange(ar, i, ar.length);
            }
        }
        throw new RuntimeException();
    }

    public boolean ContainedIfCheckedNum(int[] ar) throws RuntimeException {
        HashSet hs = new HashSet();
        for (int i : ar) {
            hs.add(i);
        }
        if (hs.size() != 2) {
            return false;
        }
        hs.add(checkedNum);
        hs.add(checkedNumEx);
        if (hs.size() != 2) {
            return false;
        }
        return true;

    }

}
