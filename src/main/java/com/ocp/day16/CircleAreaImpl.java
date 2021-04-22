
package com.ocp.day16;

import com.ocp.day16.CircleArea.CircleVolume;


public class CircleAreaImpl implements CircleArea, CircleVolume {

    @Override
    public double getArea(double r)  {
        return r * r * Math.PI;
    }

    @Override
    public double getVol(double s) {
        return s * s * s * Math.PI / 3 * 4;
    }

    
    
}
