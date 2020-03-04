/*
N-th Power
https://www.codewars.com/kata/57d814e4950d8489720008db
*/

public class Kata {
  public static int nthPower(int[] array, int n) {
    return array.length <= n ? -1 : (int) java.lang.Math.pow(array[n], n);
  }
}
