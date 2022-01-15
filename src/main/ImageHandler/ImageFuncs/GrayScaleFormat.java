package main.ImageHandler.ImageFuncs;

import main.ImageHandler.HoleFiller.Pixel;

import java.awt.*;

public class GrayScaleFormat implements ImageFormat {

    public GrayScaleFormat(){

    }

    @Override
    public float format(Color c) {
        return ((c.getBlue() + c.getGreen() + c.getRed()) / 3) / 255;
    }

    @Override
    public boolean isHole(Color c) {
        return this.format(c) < 0.5;
    }
}
