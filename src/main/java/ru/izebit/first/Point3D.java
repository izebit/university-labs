package ru.izebit.first;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * @author <a href="mailto:izebit@gmail.com">Artem Konovalov</a> <br/>
 * Date: 21.10.2019
 */
@Data
@RequiredArgsConstructor
public class Point3D {
    private final double x;
    private final double y;
    private final double z;

    public Point3D() {
        this(0.0, 0.0, 0.0);
    }

    /**
     * returns distance between two points
     *
     * @param another point
     * @return distance
     */
    public double distanceTo(Point3D another) {
        return Math.sqrt(
                Math.pow(x - another.x, 2)
                        + Math.pow(y - another.y, 2)
                        + Math.pow(z - another.z, 2));
    }
}
