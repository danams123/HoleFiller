package main.ImageHandler.ImageFuncs;

public class EightConnectivityType extends ConnectivityType {

    public EightConnectivityType(){

    }

    @Override
    protected int[][] getAdj(int i, int j) {
        return new int[][]{{i - 1, j - 1}, {i - 1, j},{i - 1, j + 1}, {i + 1, j + 1}, {i + 1, j}, {i + 1, j - 1}, {i, j - 1}, {i, j + 1}};
    }
}
