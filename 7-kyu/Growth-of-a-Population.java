/*
Growth of a Population
https://www.codewars.com/kata/563b662a59afc2b5120000c6
*/

class Arge {
    public static int nbYear(int p0, double percent, int aug, int p) {
        return p0<p ? nbYear((int)(p0 + aug + (p0*percent)/100), percent, aug, p) +1:  0;   
    }
}
