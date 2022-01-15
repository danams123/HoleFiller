package ImageHandler.ImageFuncs;

import ImageHandler.HoleFiller.Pixel;

import java.util.Set;

public interface ConnectivityType {
    Set<Pixel> findBoundary(Pixel[][] pixels, Set<Pixel> hole);
}
