package main.cmdLineUtil;

import main.ImageHandler.HoleFiller.HoleFiller;
import main.ImageHandler.HoleFiller.ImageInput;
import main.ImageHandler.HoleFiller.ImageOutput;
import main.ImageHandler.HoleFiller.Pixel;
import main.ImageHandler.ImageFuncs.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class cmdLineUtil {

    public static void main(String[] args){
        try {
            if(args.length > 5) {
                throw new IllegalArgumentException("Invalid argument count");
            }
            BufferedImage image = ImageIO.read(new File(args[0]));
            BufferedImage mask = ImageIO.read(new File(args[1]));
            int z = Integer.parseInt(args[2]);
            int epsilon = Integer.parseInt(args[3]);
            int connectivtyT = Integer.parseInt(args[4]);

            if(connectivtyT != 4 && connectivtyT != 8){
                throw new IllegalArgumentException("Wrong connectivity type");
            }
            ConnectivityType con = (connectivtyT == 4)? new FourConnectivityType() : new EightConnectivityType();
            ImageInput in = new ImageInput();
            Pixel[][] pixels = new HoleFiller(in.setImage(image, mask, new GrayScaleFormat()), in.getHole()).holeFil(new EuclideanWeightFunc(z, epsilon), con);
            ImageIO.write(new ImageOutput().setImage(pixels), "jpg", new File("result.jpg"));

        }
        catch(IllegalArgumentException | IOException | IndexOutOfBoundsException e){

        }
    }
}
