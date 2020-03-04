/*
Will you make it?
https://www.codewars.com/kata/5861d28f124b35723e00005e
*/

public class Kata {
  public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
    return (mpg*fuelLeft >= distanceToPump);
  }
}
