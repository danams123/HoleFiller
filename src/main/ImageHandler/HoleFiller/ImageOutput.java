package main.ImageHandler.HoleFiller;

import java.awt.*;
import java.awt.image.BufferedImage;

public class ImageOutput {

    public ImageOutput(){

    }

    public BufferedImage setImage(Pixel[][] pixels){
        BufferedImage image = new BufferedImage(pixels.length, pixels[0].length, BufferedImage.TYPE_INT_RGB);
        for (int i = 0; i < pixels.length; i++) {
            for (int j = 0; j < pixels[0].length; j++) {
                float rgb = pixels[i][j].getVal();
                image.setRGB(i, j, new Color(rgb, rgb, rgb).getRGB());
            }
        }
        return image;
    }

}
