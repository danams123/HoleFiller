package main.ImageHandler.ImageFuncs;

import main.ImageHandler.HoleFiller.Pixel;

import java.util.Set;

public interface ConnectivityType {
    Set<Pixel> findBoundary(Pixel[][] pixels, Set<Pixel> hole);
}
