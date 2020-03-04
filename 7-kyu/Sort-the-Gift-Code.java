/*
Sort the Gift Code
https://www.codewars.com/kata/52aeb2f3ad0e952f560005d3
*/

import java.util.Arrays;
public class GiftSorter {
  public String sortGiftCode(String code) {
    char[] chars = code.toCharArray();
    Arrays.sort(chars);
    return String.copyValueOf(chars);
  }
}
