package main.ImageHandler.ImageFuncs;

import main.ImageHandler.HoleFiller.Pixel;

import java.util.HashSet;
import java.util.Set;

public abstract class ConnectivityType {
    public Set<Pixel> findBoundary(Pixel[][] pixels, Set<Pixel> hole) {
        Set<Pixel> boundary = new HashSet<>();
        for(Pixel p : hole){
            int[][] adj = this.getAdj(p.getI(), p.getJ());
            for(int[] index : adj){
                Pixel curr = pixels[index[0]][index[1]];
                if(curr.getI() < pixels.length && curr.getJ() < pixels[0].length && !hole.contains(curr)){
                    boundary.add(curr);
                }
            }
        }
        return boundary;
    }
    protected abstract int[][] getAdj(int i, int j);
}
