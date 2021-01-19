import java.util.Scanner;

import javax.swing.text.Segment;

import jdk.javadoc.internal.doclets.formats.html.resources.standard;

public class triangle {
    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        Point p1 = new Point();
        Point p2 = new Point();
        Point p3 = new Point();

        Segment seg = new Segment();

        System.out.println("enter the point for A: ");
        System.out.println("x: ");
        p1.x = sc.nextInt();
        System.out.println("y: ");
        p2.y = sc.nextInt();

        System.out.println("enter the point for B: ");
        System.out.println("x: ");
        p1.x = sc.nextInt();
        System.out.println("y: ");
        p2.y = sc.nextInt();

        System.out.println("enter the point for C: ");
        System.out.println("x: ");
        p1.x = sc.nextInt();
        System.out.println("y: ");
        p2.y = sc.nextInt();

        double AB = seg.lengthDouble(p1, p2);
        double BC = seg.lengthDouble(p2, p3);
        double CA = seg.lengthDouble(p3, p1);
    }
}
