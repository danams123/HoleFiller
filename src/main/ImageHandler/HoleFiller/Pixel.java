package main.ImageHandler.HoleFiller;


public class Pixel {
    private final int i;
    private final int j;
    private float val;

    Pixel(int i, int j, float val){
        this.i = i;
        this.j = j;
        this.val = val;
    }

    public int getI() {
        return this.i;
    }

    public int getJ() {
        return this.j;
    }

    public float getVal() {
        return this.val;
    }

    void setVal(float val) {
        this.val = val;
    }
}
