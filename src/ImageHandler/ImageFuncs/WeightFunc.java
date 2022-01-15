package ImageHandler.ImageFuncs;

import ImageHandler.HoleFiller.Pixel;

import java.util.Set;

public interface WeightFunc {
    int calcWeight(Set<Pixel> boundary, Pixel p);
}

