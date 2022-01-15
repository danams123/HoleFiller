package ImageHandler.HoleFiller;

import ImageHandler.ImageFuncs.ConnectivityType;
import ImageHandler.ImageFuncs.WeightFunc;

import java.util.HashSet;
import java.util.Set;

public class HoleFiller {
    private Pixel[][] pixels;
    private Set<Pixel> hole; //notice if it still changes in-place or deep copying it
    private Set<Pixel> boundary;

    public HoleFiller(Pixel[][] pixels, Set<Pixel> hole){
        this.pixels = pixels;
        this.hole = hole;
        this.boundary = null;
    }

    public Pixel[][] holeFil(WeightFunc w, ConnectivityType con){
        setBoundary(con);
        for(Pixel p : this.hole){
            p.setVal(w.calcWeight(this.boundary, p));
        }
        return this.pixels;
    }

    private void setBoundary(ConnectivityType con){
        this.boundary = con.findBoundary(this.pixels, this.hole);
    }

    public Pixel[][] getPixels() {
        return this.pixels;
    }
}
