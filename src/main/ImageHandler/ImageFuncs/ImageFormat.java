package main.ImageHandler.ImageFuncs;

import main.ImageHandler.HoleFiller.Pixel;

import java.awt.*;

public interface ImageFormat {
    float format(Color c);
    boolean isHole(Color c);
}
