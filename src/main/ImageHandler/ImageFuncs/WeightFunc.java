package main.ImageHandler.ImageFuncs;

import main.ImageHandler.HoleFiller.Pixel;

import java.util.Set;

public interface WeightFunc {
    float calcVal(Set<Pixel> boundary, Pixel u);
}

