package main.java.ch03_class.basic.sec11.exam02;

public class Earth {
    static final double EARTH_RADIUS = 64000;

    static final double EARTH_SURFACE;

    static {
        EARTH_SURFACE=4*Math.PI*EARTH_RADIUS*EARTH_RADIUS;
    }


}
