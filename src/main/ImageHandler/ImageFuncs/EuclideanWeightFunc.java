package main.ImageHandler.ImageFuncs;

import main.ImageHandler.HoleFiller.Pixel;

import java.util.Set;

public class EuclideanWeightFunc implements WeightFunc {
    private final int z;
    private final float epsilon;

    public EuclideanWeightFunc(int z, float epsilon){
        this.z = z;
        this.epsilon = epsilon;
    }

    @Override
    public float calcVal(Set<Pixel> boundary, Pixel u) {
        float nominator = 0, denominator = 0;
        for(Pixel v: boundary){
            float weight = this.calcWeight(u, v);
            nominator += (weight * v.getVal());
            denominator += weight;
        }
        return nominator / denominator;
    }

    private float calcWeight(Pixel u, Pixel v){
        double dist = Math.sqrt(Math.pow((u.getI() - v.getI()), 2) + Math.pow((u.getJ() - v.getJ()), 2));
        return (float) (1 / (Math.pow(dist, this.z) + this.epsilon));
    }
}
