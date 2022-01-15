package ImageHandler.HoleFiller;


public class Pixel {
    private int i;
    private int j;
    private float val;

    public Pixel(int i, int j, float val){
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

    public void setVal(float val) {
        this.val = val;
    }
}
