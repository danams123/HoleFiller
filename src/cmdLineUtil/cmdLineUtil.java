package cmdLineUtil;

import ImageHandler.HoleFiller.HoleFiller;
import ImageHandler.HoleFiller.ImageInput;
import ImageHandler.HoleFiller.ImageOutput;
import ImageHandler.HoleFiller.Pixel;
import ImageHandler.ImageFuncs.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

//enum ConnectivityType {
//    FOUR,
//    EIGHT
//}//???

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
