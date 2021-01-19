import java.util.*;

/* create class point (x, y, float)
segment(attributes p1, p2 as point)
triangle(attributes AB, BC, CA as segment)
*/

public class point {
    int x, y;

    public point() {
    }
    public point(int $x){
        $x = x;
        y = 0;
    }
    public point(int $x, int $y){
        $x = x;
        $y = y;
    }
    public Double distanceDouble(point $p){
        Double distaDouble;
        distaDouble = Math.sqrt(Math.pow(($p.x -x), 2) + Math.pow(($p.y - y), 2));
        return distaDouble;
    }
}