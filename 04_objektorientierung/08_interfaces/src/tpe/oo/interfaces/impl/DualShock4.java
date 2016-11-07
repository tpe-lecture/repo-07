package tpe.oo.interfaces.impl;

import java.awt.Point;

import tpe.oo.interfaces.api.AnalogController;
import tpe.oo.interfaces.api.DigitalController;

public class DualShock4 implements AnalogController, DigitalController {
    
    AnalogController a = new AnalogControllerImpl();
    DigitalController b = new DigitalControllerImpl();

    @Override
    public void up() {
        this.b.up();
    }

    @Override
    public void down() {
        this.b.down();
    }

    @Override
    public void left() {
        this.b.left();
    }

    @Override
    public void right() {
        this.b.right();
    }

    @Override
    public void up(double percentage) {
        this.a.up(percentage);
    }

    @Override
    public void down(double percentage) {
        this.a.down(percentage);
    }

    @Override
    public void left(double percentage) {
        this.a.left(percentage);
    }

    @Override
    public void right(double percentage) {
        this.a.right(percentage);
    }

    @Override
    public Point getPosition() {
        Point positionAnalog = a.getPosition();
        Point positionDigital = b.getPosition();
        Point result = new Point();
        
        result.x = positionAnalog.x + positionDigital.x;
        result.y = positionAnalog.y + positionDigital.y;
        return result;
    }

}
