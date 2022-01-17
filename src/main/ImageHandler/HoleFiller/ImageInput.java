package main.ImageHandler.HoleFiller;

import main.ImageHandler.ImageFuncs.ImageFormat;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.HashSet;
import java.util.Set;

public class ImageInput {
    private Set<Pixel> hole;

    public ImageInput(){
        hole = new HashSet<>();
    }

    public Pixel[][] setImage(BufferedImage image, BufferedImage mask, ImageFormat f){
        int height = image.getHeight();
        int width = image.getWidth();
        Pixel[][] pixels = new Pixel[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if(f.isHole(new Color(mask.getRGB(i, j)))){
                    pixels[i][j] = new Pixel(i, j, f.getHoleVal());
                    hole.add(pixels[i][j]);
                }
                else{
                    pixels[i][j] = new Pixel(i, j, f.format(new Color(image.getRGB(i, j))));
                }
            }
        }
        return pixels;
    }

    public Set<Pixel> getHole() {
        return this.hole;
    }
}
