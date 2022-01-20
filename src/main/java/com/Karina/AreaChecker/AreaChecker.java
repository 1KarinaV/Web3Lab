package com.Karina.AreaChecker;

import com.Karina.Values.Values;

public class AreaChecker implements AreaChecking {
    @Override
    public boolean checkArea(Values values) {
        if (values.getX() < 0 && values.getY() > 0) {
            return false;
        } else if (values.getX() <= 0 && values.getY() <= 0) {
            if (Math.pow(Math.abs(values.getX()), 2) + Math.pow(Math.abs(values.getY()), 2) <= values.getR() ) {
                return true;
            } else {
                return false;
            }
        } else if (values.getX() >= 0 && values.getY() <= 0) {
            if (values.getX() <= values.getR() && values.getY() >= -values.getR()) {
                return true;
            } else {
                return false;
            }
        } else if (values.getX() >= 0 && values.getY() >= 0) {
            if ((values.getX() <= values.getR()/2) && (values.getY() <= ( values.getR() / 2 - values.getX()))) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}