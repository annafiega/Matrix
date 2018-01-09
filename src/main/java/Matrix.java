import java.util.*;
public class Matrix {
    private int[][] matrix;
    public Matrix( int n, int m){
        matrix = new int[n][m];
    }
    public void fillMatrix () {

        Random randomGenerator = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = randomGenerator.nextInt(10);
                System.out.print((matrix[i][j]) + " | ");
            }
            System.out.println();
        }
    }

    public Matrix transpose() {
        Matrix transposeMatrix = new Matrix(matrix[0].length, matrix.length);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transposeMatrix.matrix[j][i] = matrix[i][j];
            }
        }
        return transposeMatrix;
    }
    @Override
    public String toString(){
        String temp = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                temp += matrix[i][j] + " | ";
            }
            temp+="\n";
        }
        return temp;
    }
}
class App {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(4, 5);
        matrix.fillMatrix();
        System.out.println("");
        Matrix x = matrix.transpose();
        System.out.println(x);
    }
}
