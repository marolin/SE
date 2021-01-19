import java.util.*;

public class segment {
    point p1, p2;

    public segment(){

    }
    public segment(Point p1, point p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    
    public Double lengthDouble(Point p1, point p2){
        return p1.distanceDouble(p2);
    }
}
