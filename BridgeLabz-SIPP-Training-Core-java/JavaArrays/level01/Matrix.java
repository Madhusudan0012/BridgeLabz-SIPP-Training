public class Matrix{
    public static void main(String[] args) {
        int[][][] matrix = new int[3][3][3];
        for(int i = 0 ; i<3 ; i++){
            for(int j = 0 ; j<3 ; j++){
                for(int k = 0 ; k<3 ; k++){
                    matrix[i][j][k] = i+j+k;
                }
            }
        }
        System.out.println("3D Arrays");
        for(int i= 0 ; i < 3 ; i++){
            for(int j = 0 ; j<3 ; j++){
                for(int k = 0 ; k<3; k++){
                    System.out.println(matrix[i][j][k] + " ");

                }
                System.out.println();
            }
            System.out.println();
        }

    }
}