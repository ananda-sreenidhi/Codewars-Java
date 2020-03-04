/*
Grasshopper - Grade book
https://www.codewars.com/kata/55cbd4ba903825f7970000f5
*/

public class GrassHopper {
    public static char getGrade(int s1, int s2, int s3) {
      char[] grades = {'F', 'F', 'F', 'F', 'F', 'F', 'D', 'C', 'B', 'A', 'A'};
      return grades[(s1+s2+s3)/30];
    }
}
