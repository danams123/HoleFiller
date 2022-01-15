package main.ImageHandler.HoleFiller;

import main.ImageHandler.ImageFuncs.ImageFormat;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.HashSet;
import java.util.Set;

public class ImageInput {
    private Set<Pixel> hole;

    public ImageInput(){
        hole = new HashSet<Pixel>();
    }

    public Pixel[][] setImage(BufferedImage image, BufferedImage mask, ImageFormat f){
        int height = image.getHeight();
        int width = image.getWidth();
        Pixel[][] pixels = new Pixel[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                Color c = new Color(mask.getRGB(i, j));
                if(f.isHole(c)){
                    pixels[i][j] = new Pixel(i, j, -1);
                    hole.add(pixels[i][j]);
                }
                else{
                    pixels[i][j] = new Pixel(i, j, f.format(c));
                }
            }
        }
        return pixels;
    }

    public Set<Pixel> getHole() {
        return this.hole;
    }
}
