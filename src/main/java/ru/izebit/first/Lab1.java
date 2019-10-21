package ru.izebit.first;

/**
 * @author <a href="mailto:izebit@gmail.com">Artem Konovalov</a> <br/>
 * Date: 21.10.2019
 */
public class Lab1 {
    public static void main(String[] args) {
        Point3D p1 = new Point3D();
        Point3D p2 = new Point3D(1000, 1000, 1000);
        Point3D p3 = new Point3D(100, 10, 100);
        System.out.println(computeArea(p1, p2, p3));
    }

    private static double computeArea(Point3D p1, Point3D p2, Point3D p3) {
        double a = p1.distanceTo(p2);
        double b = p2.distanceTo(p3);
        double c = p3.distanceTo(p1);
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
