package mate.academy.homeWork1.homeEx6;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = Matrix.create(new int[2][2]);
        show(matrix);
        int minArray = min(matrix);
        int maxArray = max(matrix);
        System.out.println(minArray);
        System.out.println(maxArray);

    }

    private static int[][] create(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 20) - 10;
            }
        }
        return matrix;
    }

    private static int min(int[][] array){
        int result = 0;
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                if(array[i][j] < min){
                    result = array[i][j];
                }
            }
        }
        return result;
    }

    private static int max(int[][] array){
        int result = 0;
        int max = array.length;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                if(array[i][j] > max){
                    result = array[i][j];
                }
            }
        }
        return result;
    }

    private static void show(int[][] matrixToPrint) {
        for (int i = 0; i < matrixToPrint.length; i++) {
            for (int j = 0; j < matrixToPrint.length; j++) {
                System.out.print(matrixToPrint[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
