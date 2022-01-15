package ImageHandler.ImageFuncs;

import ImageHandler.HoleFiller.Pixel;

import java.util.Set;

public class FourConnectivityType implements ConnectivityType {

    public FourConnectivityType() {

    }

    @Override
    public Set<Pixel> findBoundary(Pixel[][] pixels, Set<Pixel> hole) {
        for(Pixel p : hole){

        }
        return null;
    }
}
