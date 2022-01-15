package ImageHandler.ImageFuncs;

import ImageHandler.HoleFiller.Pixel;

import java.util.Set;

public class EightConnectivityType implements ConnectivityType {

    public EightConnectivityType(){

    }

    @Override
    public Set<Pixel> findBoundary(Pixel[][] pixels, Set<Pixel> hole) {
        return null;
    }
}
