package tpe.oo.interfaces.impl;

import java.awt.Point;

import tpe.oo.interfaces.api.AnalogController;

public class AnalogControllerImpl implements AnalogController {

    private Point position = new Point(0, 0);
    private double xKoordinate = 0.0;
    private double yKoordinate = 0.0;

    @Override
    public void up(double percentage) {
        this.yKoordinate -= percentage;
    }

    @Override
    public void down(double percentage) {
        this.yKoordinate += percentage;
    }

    @Override
    public void left(double percentage) {
        this.xKoordinate -= percentage;
    }

    @Override
    public void right(double percentage) {
        this.xKoordinate += percentage;
    }

    @Override
    public Point getPosition() {
        return new Point((int) xKoordinate,(int) yKoordinate);
//        this.position.setLocation(xKoordinate, yKoordinate);
//        return position;
    }

}
