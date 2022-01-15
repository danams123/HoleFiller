package ImageHandler.ImageFuncs;

import ImageHandler.HoleFiller.Pixel;

import java.util.Set;

public class EuclideanWeightFunc implements WeightFunc {
    int z;
    int epsilon;

    public EuclideanWeightFunc(int z, int epsilon){
        this.z = z;
        this.epsilon = epsilon;
    }

    @Override
    public int calcWeight(Set<Pixel> boundary, Pixel p) {
        return 0;
    }
}
