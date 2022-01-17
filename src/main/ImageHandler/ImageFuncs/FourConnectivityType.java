package main.ImageHandler.ImageFuncs;

public class FourConnectivityType extends ConnectivityType {

    public FourConnectivityType() {

    }

    @Override
    protected int[][] getAdj(int i, int j) {
        return new int[][]{{i - 1, j}, {i + 1, j}, {i, j - 1}, {i, j + 1}};
    }


}
