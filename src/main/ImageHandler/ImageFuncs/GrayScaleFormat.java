package main.ImageHandler.ImageFuncs;
import java.awt.*;

public class GrayScaleFormat implements ImageFormat {

    private final float holeVal = -1;

    public GrayScaleFormat(){

    }

    @Override
    public float format(Color c) {
        float rgb = (float)(c.getBlue() + c.getGreen() + c.getRed()) / 3;
        return rgb / 255;
    }

    @Override
    public boolean isHole(Color c) {
        return this.format(c) < 0.5;
    }

    @Override
    public float getHoleVal() {
        return this.holeVal;
    }
}
