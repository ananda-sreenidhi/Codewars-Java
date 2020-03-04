/*
Reversed Words
https://www.codewars.com/kata/51c8991dee245d7ddf00000e
*/

import java.util.Collections;
import java.util.Arrays;
public class ReverseWords{
 public static String reverseWords(String str){
     String[] words = str.split(" ");
     Collections.reverse(Arrays.asList(words));
     return String.join(" ", words);
 }
}
