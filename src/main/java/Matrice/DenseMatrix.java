package Matrice;

public class DenseMatrix {
    private int nRows, nCols;
    private Double[][] vals;

    public DenseMatrix(Double [][] mat) {
        nRows = mat.length;
        nCols = mat[0].length;
    }

    public DenseMatrix(int n, int m) {
        new DenseMatrix(n, m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                vals[i][j] = 0.0;
            }
        }
    }
    public int getRowDimension(){
        return nRows;
    }
    public int getColDimension(){
        return nCols;
    }
    public int doubleget(int nRows, int nCols) {
        int row = nRows;
        int col = nCols;
        return row * col;
    }

    public int set(int i, int j, double aji) {

    }
}
