/*
Expressions Matter
https://www.codewars.com/kata/5ae62fcf252e66d44d00008e
*/

import java.util.Arrays;

public class Kata {
    public static int expressionsMatter(int a, int b, int c) {
        int[] x = {a+b+c, (a+b)*c, a*(b+c), (a*b)+c, a+(b*c), a*b*c};
        return Arrays.stream(x).max().getAsInt();
    }
}
